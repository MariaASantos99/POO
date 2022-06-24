package Maria_87965;

public class Sport {
    private int numPar = 0;
    private final int toalPar = 10;
    private final double price = 30;
    private Modality modality;

    Sport(Modality mod , int particip){
        modality = mod;
        if(particip < toalPar){
            numPar = particip;
        }else{
            numPar = toalPar;
        }
    }

    public enum Modality {
        KAYAK, HIKING;
    }
    
    double getPrice(){return price;}
    int getPart(){return numPar;}

}


