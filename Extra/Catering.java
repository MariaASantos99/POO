package Maria_87965;

public class Catering {
    private int numPar = 0;
    private static int price = 25;
    private Option op;

    Catering(Option op , int particip){
        this.op = op;
        numPar = particip;
    }

    public enum Option {
        FULL_MENU, DRINKS_AND_SNACKS, LIGHT_BITES;
    }

    double getPrice(){return price;}
}
