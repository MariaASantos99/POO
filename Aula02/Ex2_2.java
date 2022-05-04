package Aula02;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 1.8*C + 32;
        System.out.printf("A temperatura %.3f ºC corresponde a %.3f ºF",C,F);
        sc.close();
    }
}
