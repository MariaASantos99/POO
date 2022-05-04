package Aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex2_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cateto A: ");
        double catA = sc.nextDouble();
        System.out.print("Cateto B: ");
        double catB = sc.nextDouble();
        double hip = Math.sqrt(Math.pow(catA,2)+Math.pow(catB, 2));
        double angulo = Math.acos(catA/hip);
        System.out.printf("A hipotenusa é %.3f e o angulo entre o catetoA e a hipotenusa é %.3f",hip,angulo);
        sc.close();
    }
    
}
