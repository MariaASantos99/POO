package Aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex2_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ponto1 (x e y): ");
        String ponto1 = sc.nextLine();
        double x1 = Double.parseDouble(ponto1.split(" ")[0]);
        double y1 = Double.parseDouble(ponto1.split(" ")[1]);
        System.out.print("Ponto2 (x e y): ");
        String ponto2 = sc.nextLine();
        double x2 = Double.parseDouble(ponto2.split(" ")[0]);
        double y2 = Double.parseDouble(ponto2.split(" ")[1]);
        double distancia =  Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        System.out.printf("A distancia entre os pontos (%%.3f,%.3f) e (%.3f,%.3f) é, %.3f",x1,y1,x2,y2,distancia);
        sc.close();
    }
}
