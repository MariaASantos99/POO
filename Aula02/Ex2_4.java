package Aula02;

import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante: ");
        double montante = sc.nextDouble();
        System.out.print("Taxa: ");
        double taxaper = sc.nextDouble();
        double taxa = taxaper/100;
        double total = montante;
        for(int i = 1; i<=3; i++){
            total += total*taxa;
        }
        System.out.printf("Com um montante de %.3f e uma taxa mensal de %.3f os juros no final de 3meses é %.3f",montante,taxaper,total);
        sc.close();
    }
}
