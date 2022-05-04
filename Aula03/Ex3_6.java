package Aula03;

import java.util.Scanner;
public class Ex3_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mes, ano;
        do{
            System.out.print("Mês: ");
            mes = sc.nextInt();
            System.out.print("Ano: ");
            ano = sc.nextInt();
        }while(mes<=0 || mes>12);
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(mes == 2){
            if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
                dias[mes-1] = 29;
            }else{
                dias[mes-1] = 28;
            }
        }
        System.out.printf("O mês %d do ano %d tem %d dias", mes, ano, dias[mes-1]);
        sc.close();
    }
}
