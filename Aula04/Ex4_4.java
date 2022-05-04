package Aula04;

import java.util.Scanner;
public class Ex4_4 {
    public static void main(String[] args){
        int[] dados = validarDados();
        printCalendario(dados[0], dados[1], dados[2]);
    }
    
    public static int[] validarDados(){
        Scanner sc = new Scanner(System.in);
        int[] dataValida = new int[3];
        boolean valida = true;
        int ano = 0, mes = 0,dia = 0;
        do{
            System.out.print("Ano: ");
            ano = sc.nextInt();
            System.out.print("Mês: ");
            mes = sc.nextInt();
            System.out.print("Dia da semana em que começa o mês: ");
            dia = sc.nextInt();
            if(mes<1 || mes > 12 || dia<1 || dia > 7){valida = false;}
            else{valida=true;}
        }while(!valida);
        sc.close();
        dataValida[0] = ano;
        dataValida[1] = mes;
        dataValida[2] = dia;        
        return dataValida;
    }

    public static int contaDiasMes(int ano, int mes){
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(mes == 2){
            if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
                dias[mes-1] = 29;
            }else{
                dias[mes-1] = 28;
            }
        }
        return dias[mes-1];
    }

    public static void printCalendario(int ano, int mes, int diaSemana){
        int diasMes = contaDiasMes(ano, mes);
        int posicao = 0;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.printf(" %11s %d \n",meses[mes-1], ano);
        System.out.printf("%2s %2s %2s %2s %2s %2s %2s \n","Su","Mo","Tu","We","Th","Fr","Sa");
        diaSemana = diaSemana%7;
        for(int i=1; i<=diasMes; i++){
            if(i==1){
                System.out.printf("%"+((diaSemana+1)*3-1)+"d ", i);
                posicao = diaSemana+1;
               
            }else{
                System.out.printf("%2d ",i);
                posicao++;
            }
            if(posicao%7 == 0){System.out.println();}
        }
    }
}
