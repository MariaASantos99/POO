//package 87965;
package Maria_87965;

public class Activity {
    private Sport sp;
    private Catering ct;
    private Culture cul;
    private double price=0;
    private int part =0;
    Activity(Sport sport){
        sp = sport;
        price = sp.getPrice();
        part = sp.getPart();
    }

    Activity(Catering catering){
        ct = catering;
        price = ct.getPrice();
    }

    Activity(Culture culture){
        cul = culture;
        price = cul.getPrice();
    }

    double getPrice(){return this.price;}

    @Override
    public String toString(){
        return String.format("%s with %d participantes",  )
    }

}
