package POO_T10_87965;

import java.io.*;
import java.util.*;

public class RandomTickets {
    private ArrayList<Tickets> festivais = new ArrayList<>() ;
    private Map<String,Map<String,Integer>> sorteio = new HashMap<>();

    public  RandomTickets(){
        Scanner sc;
        List<String> lis = new ArrayList<>();
        try {
            sc = new Scanner(new File("src/POO_T10_87965/Lista_festivais.txt"));
            while(sc.hasNextLine()){
                lis.add(sc.nextLine());
            }

            for(int i=1; i<lis.size(); i++){
                String[] inf = lis.get(i).split("\t");
                festivais.add(new Tickets(inf[2], inf[3], Integer.parseInt(inf[4])));
            }
        } catch (FileNotFoundException e) {
            System.exit(0);
        }
    }

    //ISTO SAI NO FINAL
    /*public void printFestivals(){
        System.out.printf("%-24s  %-18s %s \n", "Festival", "Local", "Nº Bilhetes Disponiveis");
        for (Tickets tick : festivals) {
            System.out.println(tick);
        }
    }*/

    //Função que atribui aleatoriamente um bilhete dos festivais existentes e com bilhetes disponiveis
    private Tickets bilhete(){
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

    //Atribui a Pessoa o bilhete escolhido de forma aleatoria
    public void getRandomTicket(Person person){
        Tickets ticket = bilhete();
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
            }else{
                getRandomTicket(person);
            }
        }else{
            pessoas.put(person.getName(), 1);
        }
        for(Tickets t : festivais){
            if(t.getName().equals(nameFest)){
                ticket.setQty(ticket.getQty()-1);;
            }
        }
    }

    //ISTO SAI NO FINAL
    /*public void printSorteio(){
        System.out.println(sorteio);
    }*/

    //LISTA DAS PESSOAS E DO RESPETIVO FESTIVAL 
    public void listPersons(){
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

    //LISTA OS FESTIVAIS E O NÚMERO DE BILHETES AINDA DISPONIVEIS
    public void listAvailableTickets(){
        System.out.printf("%-24s  %-18s %s \n", "Festival", "Local", "Nº Bilhetes Disponiveis");
        for (Tickets ticket : festivais) {
            System.out.println(ticket);
        }
    }
}
