package Aula09;



public class Date implements Comparable<Date>{
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

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if( (this != null && obj == null) || (getClass() != obj.getClass()) ){
            return false;
        }
        Date data = (Date) obj;
        if(year != data.getYear() || day != data.getDay() || month != data.getMonth()){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return day+month+year;
    }

    
    @Override
    public int compareTo(Date obj){
        int yearDif = this.year - obj.getYear();
        if(yearDif == 0){
            int monthDif = this.month - obj.getMonth();
            if(monthDif == 0){
                return this.day - obj.getDay();
            }
            return monthDif;
        }
        return yearDif;
    }
}

