package Aula04;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra/frase: ");
        String frase = sc.nextLine();
        //Impre a string com letras minusculas
        System.out.println(frase.toLowerCase());
        //Impre o ultimo carater da string
        System.out.println(frase.charAt(frase.length()-1));
        //Impre os 3 primeiros carateres da string
        System.out.println(frase.substring(0, 3));
        //Verificar se frase é uma sequencia de carateres ordenadas por ordem crescente
        String[] arrayfrase = frase.split(" ");
        for(int i=0; i < arrayfrase.length; i++){
            System.out.println(arrayfrase[i]);
        }
        sc.close();
    }
}
