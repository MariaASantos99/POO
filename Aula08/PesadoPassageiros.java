package Aula08;

public class PesadoPassageiros extends Veiculos{
    private String numQuadro;
    private double peso;
    private double maxPassageiro;

    PesadoPassageiros(String mat, String mod, String marc, double p,String num, double peso, double max){
        super(mat, mod, marc, p);
        this.numQuadro = num;
        this.peso = peso;
        maxPassageiro = max;
    }

    String getMatricula(){return this.matricula;}
    void setMatricula(String m){this.matricula = m;}

    String getModelo(){return this.modelo;}
    void setModelo(String m){this.modelo = m;}

    String getMarca(){return this.marca;}
    void setMarca(String m){this.marca = m;}

    double getPotencia(){return this.potencia;}
    void setPotencia(double p){this.potencia = p;}

    String getNumQuadro(){return this.numQuadro;}
    void setNumQuadro(String num){this.numQuadro = num;}
    
    double getPeso(){return this.peso;}
    void setPeso(double p){this.peso = p;}

    double getmaxPassageiros(){return this.maxPassageiro;}
    void setMaxPassageiro(double max){this.maxPassageiro = max;}

    @Override
    String getType(){return "Pesado de Passageiros";}

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){return false;}
        PesadoPassageiros m = (PesadoPassageiros) obj;
        return this.getMarca() == m.getMarca() && this.getModelo() == m.getModelo();
    }

    @Override
    public String toString(){
        return "É um pesado de passageiros com " + super.toString();
    }
}
