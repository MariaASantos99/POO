package Aula07;

import java.util.Scanner;

public class Ex7_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op = -1;
        Date data = null;
        do{
            System.out.print("Data operations: \n" +
                            "1 - create new date \n" + 
                            "2 - show current date \n" +
                            "3 - increment date \n" +
                            "4 - descrement date \n" +
                            "0 - exit \n");
            System.out.print("Opção: ");
            op = sc.nextInt();
            switch(op){
                case 0:
                    System.out.println("A terminar...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Dia: ");
                    int dia = sc.nextInt();
                    System.out.print("Mês: ");
                    int mes = sc.nextInt();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    data = new DateYMD(dia, mes, ano);
                    break;
                case 2:
                    System.out.println(data);
                    break;
                case 3:
                    data.increment();
                    break;
                case 4:
                    data.descrement();
                    break;
                default:
                System.out.println("Opção inválida!");
                    break;
            }

        }while(op != 0);
        sc .close();
    }
}
