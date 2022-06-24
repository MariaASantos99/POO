package Aula07;

public class Alojamento {
   
    private String codigo;
    private String nome ;
    private String local;
    private double preco;
    private boolean disponibilidade = true;
    private int avaliacao;

    public Alojamento(String codigo, String nome, String local, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.preco = preco;
        this.avaliacao = (int)((Math.random()*4)-1);
    }

    public String getCod(){return this.codigo;}
    public void setCod(String cod){this.codigo = cod;}

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}
    
    public String getLocal(){return this.local;}
    public void setLocal(String local){this.local = local;}

    public double getPreco(){return this.preco;}
    public void setPreco(double preco){this.preco = preco;}

    public int getAvaliacao(){return this.avaliacao;}
    public void setAvaliacao(int avaliacao){
        if(avaliacao<1 || avaliacao>5){
            this.avaliacao = (int)((Math.random()*4)-1);
        }else{this.avaliacao = avaliacao;}
    }

    public boolean getDisp(){return this.disponibilidade;}
    //public void setDisp(boolean disp){this.disponibilidade = disp;}

    public void checkIn(){this.disponibilidade = false;}
    public void checkOut() {this.disponibilidade = true;}

    @Override
    public String toString(){
        return this.codigo + ": Alojamento " + this.nome + ", em " + this.local +
            ", preco: " + this.preco + ", classificacao(1-5): " + this.avaliacao + 
            ", disponibilidade (" + this.disponibilidade + ")";
    }
}
