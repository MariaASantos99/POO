package Aula08;

public abstract class Alimento {
    protected double proteinas;
    protected double calorias;
    protected double peso;

    Alimento(double pr, double c, double p){
        proteinas = pr;
        calorias = c;
        peso = p;
    }

    abstract double getProteinas();
    abstract void setProteinas(double p);

    abstract double getCalorias();
    abstract void setCalorias(double c);

    abstract double getPeso();
    abstract void setPeso(double p);

    @Override
    public String toString(){
        return ", Proteinas " + proteinas + ", Calorias " + calorias + ", Peso " + peso;
    }
}
