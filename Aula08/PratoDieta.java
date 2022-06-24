package Aula08;

public class PratoDieta extends Prato{
    
    private double maxCal, max;
    PratoDieta(String nome, double max){
        super(nome);
        maxCal = max;
    }

    public double getMaxCal(){return this.maxCal;}
    public double getMax(){return this.max;}
    @Override
    public boolean addIngrediente(Alimento a){
        double alCal = a.getCalorias()*a.getPeso() /100;
        if(max + alCal > maxCal){
            return false;
        }
        max += (a.calorias*a.peso)/100;
        return super.addIngrediente(a);
    }

    @Override
    public String toString(){
        return super.toString() + " - Dieta ("+String.format("%.2f", max)+" Calorias)";
    }
}
