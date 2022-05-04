package Aula03;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex3_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int montante = 0;
        double taxa = -1.0;
        boolean validar = false;
        do{
            try{
                System.out.print("Montante investido: ");
                montante = sc.nextInt();
                System.out.print("Taxa do juro mensal: ");
                taxa = sc.nextDouble();
                if(montante % 1000 == 0 && (taxa>=0 && taxa <=5)) validar = true;
            }catch(InputMismatchException ex){
                System.out.println("Formatação inválida!");
                sc.nextLine();
            }
        }while(!validar);
        sc.close();
        double juros = taxa/100;
        double total = montante;
        for(int i=1; i<=12; i++){
            total += total*juros;
            System.out.printf("Valor do fundo no mês %d é de %.2f \n",i,total);
        }
    }
}
