package Aula07;

public class Apartamento extends Alojamento{
    private int numQuartos;
    Apartamento(String cod, String nome, String local, double preco, int numQuartos){
        super(cod, nome, local, preco);
        this.numQuartos = numQuartos;
    }

    public int getNumQuartos(){return this.numQuartos;}
    public void setNumQuartos(int num){this.numQuartos = num;}

    @Override
    public String toString(){
        return "Apartamento no " + super.toString() + "com " + this.numQuartos + "quartos";
    }
}
