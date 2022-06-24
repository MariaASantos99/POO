package Aula07;

public class Triangulo extends Forma {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double l1, double l2, double l3, String cor){
        assert l1 > 0 && l2 > 0 && l3 > 0 : "Valores têm de ser maiores que 0";
        assert l1 < l2+l3 && l2 < l1+l3 && l3 < l1+l2 : "Valores inválidos!";
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
        this.cor = cor;
    }

    public double getLado1(){return this.lado1;}

    public double getLado2(){return this.lado2;}

    public double getLado3(){return this.lado3;}

    public void setLado1(double newL1){
        assert newL1 < lado2+lado3 && lado2 < newL1+lado3 && lado3 < newL1+lado2 : "Valor para Lado1 inválido!";
        this.lado1 = newL1;
    }

    public void setLado2(double newL2){
        assert lado1 < newL2+lado3 && newL2 < lado1+lado3 && lado3 < newL2+lado1 : "Valor para Lado2 inválido!";
        this.lado2 = newL2;
    }

    public void setLado3(double newL3){
        assert lado1 < lado2+newL3 && lado2 < lado1+newL3 && newL3 < lado1+lado2 : "Valor para Lado3 inválido!";
        this.lado3 = newL3;
    }

  
    public boolean equals(Triangulo t){
        boolean valid = false;
        if(super.equals(t)){
            if(this.lado1 == t.getLado1() ){
                if((this.lado2 == t.getLado2() && this.lado3 == t.getLado3()) || (this.lado2==t.getLado3() && this.lado3 == t.getLado2())){valid=true;}
            }else if(this.lado1 == t.getLado2()){
                if((this.lado2 == t.getLado1() && this.lado3 == t.getLado3()) || (this.lado2==t.getLado3() && this.lado3 == t.getLado1())){valid=true;}
            }else if(this.lado1 == t.getLado3()){
                if((this.lado2 == t.getLado2() && this.lado3 == t.getLado1()) || (this.lado2==t.getLado1() && this.lado3 == t.getLado2())){valid=true;}
            }else{valid=false;}
        }
        return valid;
    }

    @Override
    public String toString(){
        return "TRIÂNGULO com 3 lados: (" + this.lado1 + ", " + this.lado2 +", " + this.lado3 + "), cor = " + this.cor;
    }

    public double area(){
        double p = (lado1+lado2+lado3)/2;
        double area = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
        return area;
    }

    public double perimetro(){
        return lado1+lado2+lado3;
    }
}
