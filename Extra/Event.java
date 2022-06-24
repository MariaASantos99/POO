package Maria_87965;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
//package 87965;

public class Event implements IEvent{
    
    private Client cl;
    private LocalDate date;
    private Set<Activity> activitys;
    private double total = 0;

    Event(Client c, LocalDate d){
        cl = c; date = d;
        activitys = new HashSet<>();
    }

    public Client getClient(){return this.cl;}
    public LocalDate getDate(){return this.date;}
    public double totalPrice(){return this.total;}

    public Event addActivity(Activity activity){
        activitys.add(activity);
        total += activity.getPrice();
        return this;
    }

    @Override
    public String toString(){
        return String.format("*** Evento em %s, total = %.2f euros \n"+
                            "%s", date, total, activitys);
    }
}
