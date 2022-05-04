package Aula03;

import java.util.*;
public class Ex3_7 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int n=0, count=0;
        String repetir = "sim";
        while(repetir.toLowerCase().equals("sim") || repetir.toLowerCase().equals("s")){
            number = (int)(Math.random()*100);
            System.out.println(number);
            count = 0;
            do{
                System.out.print("Digite um numero: ");
                n = sc.nextInt();
                if(n!=number){
                    if(n>number){
                        System.out.println("Numero demasiado alto!");
                    }else{
                        System.out.println("Numero demasiado baixo!");
                    }
                }
                count++;
            }while(number != n);
            System.out.printf("Você acertou após %d tentativas\n",count);
            System.out.print("Você deseja recomeçar? ");
            repetir = sc.next();
        }
        sc.close();
    }
}
