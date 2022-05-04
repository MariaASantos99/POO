package Aula05;

import java.lang.Math;

public class Circulo {
    private double raio;

    public Circulo(double raio){
        assert raio > 0.0 : "Raio inválido!";
        this.raio = raio;
    }

    public double getRaio(){return this.raio;}

    public void setRaio(double newraio){
        assert newraio > 0.0 : "Raio inválido!";
        this.raio = newraio;
    }

    public boolean equals(Circulo c1){
        if(this.raio != c1.getRaio()){return false;}
        return true;
    }

    public String toString(){
        return "CIRCULO com raio = " + this.raio;
    }

    public double areaCirculo(){
        return Math.PI*Math.pow(raio, 2);
    }

    public double perimetroCirculo(){
        return 2*Math.PI*raio; 
    }
}
