package Aula07;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio, String cor){
        assert raio > 0.0 : "Raio inválido!";
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio(){return this.raio;}

    public void setRaio(double newraio){
        assert newraio > 0.0 : "Raio inválido!";
        this.raio = newraio;
    }

    public boolean equals(Circulo c1){
        if(this.raio != c1.getRaio() || !super.equals(c1)){return false;}
        return true;
    }

    @Override
    public String toString(){
        return "CIRCULO com raio = " + this.raio + ", cor = " + this.cor;
    }

    public double area(){
        return Math.PI*Math.pow(raio, 2);
    }

    public double perimetro(){
        return 2*Math.PI*raio; 
    }
}

