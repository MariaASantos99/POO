package Aula08;

public class AutomoveLigeiro extends Veiculos {
    private String numQuadro;
    private int capacidadeBag;

    AutomoveLigeiro(String mat, String mod, String marc, double p, String num, int cap){
        super(mat, mod, marc, p);
        numQuadro = num;
        capacidadeBag = cap;
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

    int getCapacidade(){return this.capacidadeBag;}
    void setCapacidade(int cap){this.capacidadeBag = cap;}

    @Override
    String getType(){return "Automovel Ligeiro";}

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){return false;}
        AutomoveLigeiro m = (AutomoveLigeiro) obj;
        return this.getMarca() == m.getMarca() && this.getModelo() == m.getModelo();
    }

    @Override
    public String toString(){
        return "É um automovel ligeiro com " + super.toString();
    }
}
