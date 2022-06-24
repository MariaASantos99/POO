package POO_T10_87965;

import java.io.*;
import java.util.*;

public class Teste {
    public static void main(String[] args) throws IOException {
        ArrayList<Tickets> festivais = new ArrayList<>();
        List<String> lis = new ArrayList<>();
        Map<String,Map<String,Integer>> sorteio = new HashMap<>();
        Scanner sc = new Scanner(new File("src/POO_T10_87965/Lista_festivais.txt"));
        while(sc.hasNextLine()){
            lis.add(sc.nextLine());
        }

        for(int i=1; i<lis.size(); i++){
            String[] inf = lis.get(i).split("\t");
            festivais.add(new Tickets(inf[2], inf[3], Integer.parseInt(inf[4])));
        }

        System.out.printf("%-24s  %-18s %s \n", "Festival", "Local", "Nº Bilhetes Disponiveis");
        for (Tickets tick : festivais) {
            System.out.println(tick);
        }



        List<Person> r = new ArrayList<Person>();        
        r.add(new Person("Maria", 34317245, new DateYMD(12, 1, 2000)));
        r.add(new Person("Carlos", 36331424, new DateYMD(1, 10, 2003)));
        r.add(new Person("Marta", 35940012, new DateYMD(31, 3, 2002)));
        r.add(new Person("Sofia", 34765901, new DateYMD(14, 7, 2000)));
        r.add(new Person("Tiago", 35006531, new DateYMD(3, 6, 2001)));

        for (int i=0; i<2*r.size(); i++) {
            int ri = (int) (Math.random()*r.size());
            sorteio = getRandomTicket(r.get(ri),festivais, sorteio);
        }
        System.out.println(sorteio);
        System.out.println("");
        listPersons(sorteio);
        listAvailableTickets(festivais);
    }
    public static void listPersons( Map<String,Map<String,Integer>> sorteio){
        Set<String> locais = sorteio.keySet();
        System.out.printf("%-25s  %-15s %s \n", "Festival", "Vencedor", "Nº Bilhetes");
        for(String l : locais){
            Map<String,Integer> p = sorteio.get(l);
            Set<String> pe = p.keySet();
            for(String pee : pe){
                System.out.printf("%-25s  %-15s %d \n", l,pee,p.get(pee));
            }
        }
        System.out.println("");
    }
    
    public static Map<String,Map<String,Integer>> getRandomTicket(Person person, ArrayList<Tickets> festivais, Map<String,Map<String,Integer>> sorteio ){
        Tickets ticket = bilhete(festivais);
        String nameFest = ticket.getName();
        Map<String,Integer> pessoas = new HashMap<>();
        if(!sorteio.containsKey(nameFest)){
            sorteio.put(nameFest, pessoas);
        }
        
        pessoas = sorteio.get(nameFest);
        String nomePerson = person.getName();
        if(pessoas.containsKey(nomePerson)){
            if(pessoas.get(nomePerson)<2){
                pessoas.put(person.getName(), pessoas.get(nomePerson)+1);
                for(Tickets t : festivais){
                    if(t.getName().equals(nameFest)){
                        ticket.setQty(ticket.getQty()-1);;
                    }
                }
            }
        }else{
            pessoas.put(person.getName(), 1);
            for(Tickets t : festivais){
                if(t.getName().equals(nameFest)){
                    ticket.setQty(ticket.getQty()-1);;
                }
            }
        }
        return sorteio;
    }

    public static Tickets bilhete(ArrayList<Tickets> festivais){
        boolean verif = false;
        Tickets result = new Tickets("", "", 0);
        while(!verif){
            int ri = (int) (Math.random()*festivais.size());
            if(festivais.get(ri).getQty()>0){
                verif = true;
                result = festivais.get(ri);
            }
        }
        return result;
    }

    public static void listAvailableTickets(ArrayList<Tickets> festivais){
        System.out.printf("%-24s  %-18s %s \n", "Festival", "Local", "Nº Bilhetes Disponiveis");
        for (Tickets ticket : festivais) {
            System.out.println(ticket);
        }
    }
}
