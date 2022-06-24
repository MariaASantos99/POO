package Aula11;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        m.add(0);
        m.add(25);
        m.add(10);
        m.add(45);

        for(Integer i : m){
            System.out.println(i);
        }
    }
}
