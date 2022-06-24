package Aula08;

public class Cereal extends Alimento implements AlimentoVegetariano{
    private String nome;
    Cereal (String n , double pro, double c, double p){
        super(pro,c,p);
        nome = n;
    }

    public double getProteinas(){return this.proteinas;}
    public void setProteinas(double p){this.proteinas = p;}

    public double getCalorias(){return this.calorias;}
    public void setCalorias(double c) { this.calorias = c;}

    public double getPeso(){return this.peso;}
    public void setPeso(double p){this.peso = p;}

    public String getNome(){return this.nome;}
    public void setNome(String n){this.nome = n;}

    @Override
    public String toString(){
        return "Cereal " + this.nome + super.toString();
    }
}
