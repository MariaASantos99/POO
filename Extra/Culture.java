package Maria_87965;

public class Culture {
    private int numPar = 0;
    private final int toalPar = 15;
    private static int price = 22;
    private Option option;

    Culture(Option option , int particip){
        this.option = option;
        if(particip < toalPar){
            numPar = particip;
        }else{
            numPar = toalPar;
        }
    }

    public enum Option {
        ARCHITECTURAL_TOUR, RIVER_TOUR, ART_MUSEUM, WINE_TASTING;
    }

    double getPrice(){return price;}
}
