package Aula03;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numero = 0, primeiro = -1, minimo = 0, maximo = 0, soma = 0;
        int count = 0;
        boolean validar = false;
        while(validar != true){
            try{
                System.out.print("Digite um número: ");
                numero = sc.nextDouble();
                validar = true;
            }catch(InputMismatchException ex){
                System.out.println("Formatação incorreta!");
                sc.nextLine();
            }
        }
        primeiro = numero;
        soma = primeiro;
        count++;
        do{
            try{
                System.out.print("Digite um número: ");
                numero = sc.nextDouble();
                if (numero < minimo){
                    minimo = numero;
                }
                if(numero> maximo){
                    maximo = numero;
                }
                count++;
                soma += numero;
            }catch(InputMismatchException ex){
                System.out.println("Formatação incorreta!");
                sc.nextLine();
            }
        }while(numero != primeiro);
        double media = soma / count;
        System.out.printf(" Máximo: %.2f\n Minimo: %.2f\n Média: %.2f\n Total de números lidos: %d",maximo,minimo,media,count);
        sc.close();

    }
}
