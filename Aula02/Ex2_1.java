package Aula02;

import java.util.*;


public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância: ");
        double km =  sc.nextDouble();
        double milhas = km / 1.609;
        System.out.printf("A distancia %.3f km corresponde a %.3f milhas", km,milhas);
        sc.close();
    }
}
