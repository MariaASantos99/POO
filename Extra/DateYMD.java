package POO_T10_87965;

public class DateYMD extends Date{
    public DateYMD(int day, int month, int year){
        assert valid(day, month, year):"Data inválida!";
        this.day = day;
        this.month = month;
        this.year = year;
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
}
