package Aula03;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        boolean valida = true; 
        do{
            try{
                System.out.print("Digitie um numero: ");
                N = sc.nextInt();
                valida = true;
            }catch(InputMismatchException ex){
                System.out.println("Formatação errada!");
                sc.nextLine();
                valida = false;
            }
        }while(!valida || N < 0);
        for(int i=N; i>=0; i--){
            System.out.println(i);
        }
        sc.close();
    }
}
