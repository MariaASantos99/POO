package POO_T10_87965;

public abstract class Date {
    protected int day;
    protected int month;
    protected int year;

    public abstract void set(int day, int month, int year);
    public abstract int getDay();
    public abstract int getMonth();
    public abstract int getYear();
    public abstract Date increment();
    public abstract Date descrement();

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

    @Override
    public String toString(){
        return getYear() + "-" + getMonth() + "-" + getDay();
    }
}
