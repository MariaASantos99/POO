package Aula02;

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade água (em quilogramas): ");
        double M = sc.nextDouble(); 
        System.out.print("Temperatura inicial (em Celsius):");
        double tempInicial = sc.nextDouble();
        System.out.print("Temperatura final (em Celsius):");
        double tempFinal = sc.nextDouble();
        double energia = M * (tempFinal - tempInicial)*4184;
        System.out.printf("A energia resultante é %.3f J",energia);
        sc.close();
    }
}
