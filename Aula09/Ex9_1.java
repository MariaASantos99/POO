package Aula09;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;

public class Ex9_1 {
    public static void main(String[] args){
        ArrayList<Integer> c1 = new ArrayList<>();
        for(int i = 10; i <= 100; i +=10){
            c1.add(i);
        }
        System.out.println("Size: " + c1.size());
        for(int i = 0; i < c1.size(); i ++){
            System.out.println("Elemento: " + c1.get(i));
        }

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        //Testar Funções extras
        c1.add(10);
        System.out.println("Index da primeira ocorrência: " + c1.indexOf(10));
        System.out.println("Index da última ocorrência: " + c1.lastIndexOf(10));
        System.out.println(c2.subList(1, c2.size()));
        System.out.println(c1.subList(3, c1.size()));
        c1.set(10, 110);
        System.out.println(c1);
        c1.remove(10);
        System.out.println(c1);

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Andreia Melo", 9855678, new Date(12,02,2020)));
        c3.add(new Pessoa("Luisa Melo", 98762345, new Date(2,01,1999)));
        c3.add(new Pessoa("Maria Melo", 12345678, new Date(20,05,2000)));
        c3.add(new Pessoa("Carlos Melo", 13579086, new Date(12,03,2020)));
        c3.add(new Pessoa("Filipa Melo", 87654321, new Date(3,01,1998)));
        c3.add(new Pessoa("Carlos Melo", 13579086, new Date(12,03,2020)));
        
        System.out.println(c3);
        System.out.println();
        Iterator<Pessoa> i = c3.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();
        
        Collection<Date> c4 = new TreeSet<>();
        c4.add(new Date(12,02,2020));
        c4.add(new Date(2,01,1999));
        c4.add(new Date(20,05,2000));
        c4.add(new Date(3,01,1998));
        c4.add(new Date(12,03,1936));

        

    }
}
