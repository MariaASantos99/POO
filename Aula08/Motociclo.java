package Aula08;

public class Motociclo extends Veiculos{
    private String tipo;
    
    Motociclo(String mat, String mod, String marc, String tipo, double p){
        super(mat, mod, marc, p);
        assert tipo == "deportivo" || tipo == "estrada": "Input inválido";
        this.tipo = tipo;
    }

    String getMatricula(){return this.matricula;}
    void setMatricula(String m){this.matricula = m;}

    String getModelo(){return this.modelo;}
    void setModelo(String m){this.modelo = m;}

    String getMarca(){return this.marca;}
    void setMarca(String m){this.marca = m;}

    double getPotencia(){return this.potencia;}
    void setPotencia(double p){this.potencia = p;}

    String getTipo(){return this.tipo;}
    void setTipo(String t){
        assert tipo == "deportivo" || tipo == "estrada": "Input inválido";
        this.tipo = t;
    }

    @Override
    String getType(){return "Motociclo";}

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){return false;}
        Motociclo m = (Motociclo) obj;
        return this.getMarca() == m.getMarca() && this.getModelo() == m.getModelo();
    }

    @Override
    public String toString(){
        return "Motociclo com " + super.toString();
    }

}
