package Aula07;

public class Retangulo extends Forma{
    private double comprimento;
    private double altura;

    public Retangulo(double comprimento, double altura, String cor){
        assert comprimento > 0 && altura > 0 : "Valores inválidos!";
        this.comprimento = comprimento;
        this.altura = altura;
        this.cor = cor;
    }

    public double getComprimento(){return this.comprimento;}

    public double getAltura(){return this.altura;}

    public void setComprimento(double newComp){
        assert newComp > 0 : "Comprimento inválido!";
        this.comprimento = newComp;
    }

    public void setAltura(double newAlt){
        assert altura > 0 : "Altura inválido!";
        this.altura = newAlt;
    }

    public boolean equals(Retangulo r1){
        if(this.comprimento != r1.getComprimento() || this.altura != r1.getAltura() || !super.equals(r1)){return false;}
        return true;
    }

    @Override
    public String toString(){
        return "RETÂNGULO com comprimento = " + this.comprimento + ", altura = " + this.altura + ", cor = " + this.cor;
    }

    public double area(){
        return this.comprimento + this.altura;
    }

    public double perimetro(){
        return 2*this.comprimento + 2*this.altura;
    }
}
