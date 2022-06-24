package Aula11;

import java.util.Scanner;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Ex11_1{
    public static void main(String[] args)  throws FileNotFoundException{
        //Scanner sc = new Scanner(new FileReader("test.txt"));
        Scanner sc = new Scanner(new FileReader("src/Aula11/major.txt"));
        sc.useDelimiter("[\\\t\n\r .,:'‘’;?!-*{}=+&/()\\[\\]”“\"\']+");
        Map<String, TreeMap<String, Integer>> palavras = new TreeMap<>();
        String word, wordprev = null;
        while(sc.hasNext()){
            word = sc.next();
            if(word.length()>2){
                if(palavras.get(word) == null){
                    palavras.put(word, new TreeMap<String, Integer>());
                }
                if(wordprev != null){
                    TreeMap<String,Integer> par = palavras.get(wordprev);
                    if(par.get(word) == null){
                        par.put(word, 1);
                    }else{
                        int value = Integer.parseInt(par.get(word).toString());
                        par.put(word, value);
                    }
                }
                wordprev = word;
            }
        }
        sc.close();
        for (String s : palavras.keySet()) {
            System.out.println(s + " = " + palavras.get(s));
        }
    }
}