package Aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex12_1 {
    public static void main(String[] args){
        try{
            Set<String> palavras = new HashSet<>();
            Scanner sc = new Scanner(new File("src/Aula12/palavras.txt"));
            int count=0;
            while(sc.hasNext()){
                palavras.add(sc.next());
                count ++;
            }
            System.out.printf("Número Total de Palavras: %d \n",count);
            System.out.printf("Número de diferentes palavras: %d \n",palavras.size());
        }catch(FileNotFoundException e){
            System.out.println("Ficheiro não existe!");
            System.exit(0);
        }
            
    }
    
}
