package Aula06;

public class Bolseiro extends Aluno{
    private double bolsa;

    Bolseiro(String nome, int cc, Date dataNasc, double bolsa){
        super(nome, cc, dataNasc);
        this.bolsa = bolsa;
    }

    double getBolsa(){return this.bolsa;}
    void setBolsa(double newvalue){this.bolsa = newvalue;}

    @Override
    public String toString(){
        return super.toString() + "; Valor da Bolsa: " + getBolsa();
    }
}
