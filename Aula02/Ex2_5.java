package Aula02;

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade1 (m/s): ");
        double v1 = sc.nextDouble();
        System.out.print("Distancia1 (m): ");
        double d1 = sc.nextDouble();
        System.out.print("Velocidade2 (m/s): ");
        double v2 = sc.nextDouble();
        System.out.print("Distancia2 (m): ");
        double d2 = sc.nextDouble();
        double dTotal = d1 + d2;
        double segTotal = d1/v1 + d2/v2;
        double vMedia = dTotal/segTotal;
        System.out.printf("A velocidade média ao longo de %.3f m é de %.3f m/s",dTotal,vMedia);
        sc.close();
    }
}
