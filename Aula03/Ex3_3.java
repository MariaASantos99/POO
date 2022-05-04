package Aula03;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = true;
        int number = 0;
        do{
            try{
                System.out.print("Digite um número: ");
                number = sc.nextInt();
            }catch(InputMismatchException ex){
                System.out.println("Formatação errada!");
                sc.nextLine();
                valida = false;
            }
        }while(!valida || number<0);
        sc.close();
        int n = (int) Math.sqrt(number);
        int i;
        for(i=2; i<=n; i++){
            if(number % i == 0){
                System.out.printf("O número %d não é um número primo",number);
                break;
            }
        }
        if(i==n+1){
            System.out.printf("O número %d é primo", number);
        }
        
    }
    
}
