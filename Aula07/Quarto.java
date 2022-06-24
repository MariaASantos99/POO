package Aula07;

public class Quarto extends Alojamento{
    private String tipo;
    Quarto(String cod, String nome, String local, double preco, String tipo){
        super(cod, nome, local, preco);
        assert (tipo == "single" || tipo == "double" || tipo == "twin" || tipo == "triple") : "Tipo inválido";
        this.tipo = tipo;  
    }

    public String getTipo(){return this.tipo;}
    public void setTipo(String tip){this.tipo = tip;}

    @Override
    public String toString(){
        return "Quarto " + super.toString() + ", tipo de quarto: " + this.tipo;
    }
}
