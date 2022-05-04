package Aula04;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza uma frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");
        String acronimo="";
        for(int i=0; i< palavras.length; i++){
            if(palavras[i].length() >2){acronimo += Character.toUpperCase((palavras[i].charAt(0)));}
        }
        if(acronimo.isEmpty()){
            System.out.println("Não é possivel formar um acrónimio, frase formada por palavras com menos de 2 carateres!");
        }else{
            System.out.println("Acrónimo: "+ acronimo);
        }
        sc.close();
    }
}
