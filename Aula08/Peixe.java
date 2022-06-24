package Aula08;

public class Peixe extends Alimento{
    private TipoPeixe tipo;
    
    Peixe (TipoPeixe tp , double pro, double c, double p){
        super(pro,c,p);
        tipo = tp;
    }

    public double getProteinas(){return this.proteinas;}
    public void setProteinas(double p){this.proteinas = p;}

    public double getCalorias(){return this.calorias;}
    public void setCalorias(double c) { this.calorias = c;}

    public double getPeso(){return this.peso;}
    public void setPeso(double p){this.peso = p;}

    public TipoPeixe getType(){return this.tipo;}
    public void setType(TipoPeixe t){this.tipo = t;}

    @Override
    public String toString(){
        return "Peixe " + this.tipo + super.toString();
    }
}
