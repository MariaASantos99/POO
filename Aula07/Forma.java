package Aula07;

public abstract class Forma {
    public String cor;
    public abstract double perimetro();
    public abstract double area();
    public String getCor(){return this.cor.toLowerCase();}

    @Override
    public boolean equals(Object obj){
        boolean res = (this == obj);
        if(!res && (obj instanceof Forma)){
            res = (this.getCor() == ((Forma) obj).getCor());
        }
        return res;
    }
}
