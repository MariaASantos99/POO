package Aula08;

public class Carne extends Alimento{
    private VariedadeCarne tipo;
    Carne (VariedadeCarne tp , double pro, double c, double p){
        super(pro,c,p);
        tipo = tp;
    }

    public double getProteinas(){return this.proteinas;}
    public void setProteinas(double p){this.proteinas = p;}

    public double getCalorias(){return this.calorias;}
    public void setCalorias(double c) { this.calorias = c;}

    public double getPeso(){return this.peso;}
    public void setPeso(double p){this.peso = p;}

    public VariedadeCarne getType(){return this.tipo;}
    public void setType(VariedadeCarne t){this.tipo = t;}

    @Override
    public String toString(){
        return "Carne " + this.tipo + super.toString();
    }
}
