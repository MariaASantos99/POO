package Aula02;

import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Tempo (em segundos): ");
        int seg = sc.nextInt();
        int horas = seg/3600;
        int minutos = (seg%3600)/60;
        int segundos = (seg%3600)%60;
        System.out.printf("%dh:%dm:%ds", horas, minutos, segundos );
        sc.close();        
    }    
}
