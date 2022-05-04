package Aula06;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        assert valid(day, month, year):"Data inválida!";
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean validMonth(int month){
        if(month<1 || month>12){
            return false;
        }
        return true;
    }

    public static int monthDays(int month, int year){
        assert validMonth(month):"Mês inválida!";
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(month == 2){
            if(leapYear(year)){
                dias[month-1] = 29;
            }else{
                dias[month] = 28;
            }
        }
        return dias[month-1];
    }

    public static boolean leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
            return true;
        }
        return false;
    }

    public static boolean valid(int day, int month, int year){
        if(year > 0 && validMonth(month)){
            if(day > 0  && day <= monthDays(month, year)){return true;}
        }
        return false;
    }

    public void set(int day, int month, int year){

        if(valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public int getDay(){return this.day;}

    public int getMonth(){return this.month;}

    public int getYear(){return this.year;}    

    public Date increment(){
        if(valid(day, month, year)){
            if(this.day == monthDays(this.month, this.year)){
                this.day = 1;
                if(this.month < 12){     
                    this.month += 1;
                }else{
                    this.month = 1;
                    this.year += 1;
                }
            }else{
                this.day += 1;
            }
        }
        return this;
    }

    public Date descrement(){
        if(valid(day, month, year)){
            if(this.day == 1){
                if(this.month == 1){
                    this.month = 12;
                    this.year -=1;
                }else{
                    this.month -=1;
                }
                this.day = monthDays(this.month, this.year);
            }else{
            this.day -=1; 
            }
        }
        return this;
    }

    public String toString(){
        return getYear() + "-" + getMonth() + "-" + getDay();
    }

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
                    data = new Date(dia, mes, ano);
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

