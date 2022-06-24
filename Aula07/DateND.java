package Aula07;

public class DateND extends Date{
    private int numDays=0;

    public DateND(int dia, int mes, int ano){
        day = dia;
        month = mes;
        year = ano;
    }

    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}
 
    public void set(int day, int month, int year){
        if(valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

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

    public int countDays(){
        boolean estado = false;
        Date d = new DateYMD(1, 1, 2000);
        while(!estado){ 
            if(d.getDay() != this.getDay() || d.getMonth() != this.getMonth() || d.getYear() != this.getYear()){
                d.increment();
                numDays++;
            }else{estado=true;}
        }    
        return numDays;
    }


    public static void main(String[] args){
        Date data = new DateND(3, 1, 2000);
        System.out.println(((DateND)data).countDays());
    }
}