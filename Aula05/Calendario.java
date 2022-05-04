package Aula05;

import java.util.Scanner;

public class Calendario {
    private int diaSemana;
    private int ano;

    public Calendario(int diaSemana, int ano){
        assert diaSemana>0 && diaSemana<8 : "Dia da semana inválida!";
        this.diaSemana = diaSemana;
        this.ano = ano;
    }

    public int year(){return this.ano;}

    public int firstWeekdayOfYear(){return this.diaSemana;}
    
    public int  firstWeekdayOfMonth(int month){
        assert Date.validMonth(month) : "Mês inválido!";
        int soma = this.diaSemana;;
            for(int i = 2; i <= month; i++){
                soma += Date.monthDays(i-1, this.ano);
            }

        return soma % 7;
    }

    public String printMonth(int month){
        String calendarMonth = "";
        int diasMes = Date.monthDays(month, ano);
        int posicao = 0;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        calendarMonth += String.format(" %11s %d \n",meses[month-1], ano);
        calendarMonth += String.format("%2s %2s %2s %2s %2s %2s %2s \n","Su","Mo","Tu","We","Th","Fr","Sa");
        int primeiroDia = firstWeekdayOfMonth(month);
        for(int i=1; i<=diasMes; i++){
            if(i==1){
                calendarMonth += String.format("%"+((primeiroDia+1)*3-1)+"d ", i);
                posicao = primeiroDia+1;
               
            }else{
                calendarMonth += String.format("%2d ",i);
                posicao++;
            }
            if(posicao%7 == 0){calendarMonth += String.format("\n");}
        }
        return calendarMonth;
    }

    public String toString(){
        String calendar = "";
        for(int i=1; i<=12; i++){
            calendar += printMonth(i) + "\n";

        }
        return calendar;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op = -1;
        Calendario calendar = null;
        do{
            System.out.print("Data operations: \n" +
                            "1 - create new calendar \n" + 
                            "2 - print calendar month \n" +
                            "3 - print calendar \n" +
                            "0 - exit \n");
            System.out.print("Opção: ");
            op = sc.nextInt();
            switch(op){
                case 0:
                    System.out.println("A terminar...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Dia da semana que começa o ano: ");
                    int diaSemana = sc.nextInt();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    calendar = new Calendario(diaSemana, ano);
                    break;
                case 2:
                    System.out.print("Mês do calendário a imprimir: ");
                    int month = sc.nextInt();
                    System.out.println(calendar.printMonth(month));
                    break;
                case 3:
                    System.out.println(calendar);
                    break;
                default:
                System.out.println("Opção inválida!");
                    break;
            }

        }while(op != 0);
        sc .close();
    }
}
