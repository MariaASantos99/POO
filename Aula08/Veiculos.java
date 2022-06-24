package Aula08;

public abstract class Veiculos implements KmPercorridosInterface {
    protected String matricula;
    protected String modelo;
    protected String marca;
    protected double potencia;
    protected int ultimoTrajeto = 0;
    protected int distanciaTotal = 0;

    
    Veiculos(String matricula, String modelo, String marca, double potencia){
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    abstract String getMatricula();
    abstract void setMatricula(String m);
    abstract String getMarca();
    abstract void setMarca(String m);
    abstract String getModelo();
    abstract void setModelo(String m);
    abstract double getPotencia();
    abstract void setPotencia(double p);

    String getType(){return "Veiculo";}
    public void trajeto(int quilometros){
        this.distanciaTotal += quilometros;
        ultimoTrajeto = quilometros;
    }

    public int ultimoTrajeto(){return this.ultimoTrajeto;}

    public int distanciaTotal(){return this.distanciaTotal;}

    @Override
    public boolean equals(Object obj){
        if(this.getClass() == obj.getClass()){
            return true;
        }else {return false;}
    }

    @Override
    public String toString(){
        return "Matricula: " + getMatricula() + ", Marca: " + getMarca() + 
            ", Modelo: " + getModelo() + ", Potencia: " + getPotencia() + 
            "\n Quilometros, no ultimo trajeto: " + this.ultimoTrajeto + ", total: " + this.distanciaTotal + "\n ";
    }
}

