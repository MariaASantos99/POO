package Aula08;

public class Prato {
    private Alimento alimento[] = new Alimento[20];
    private String nome;
    private int num = 0;

    Prato(String nome){
        this.nome = nome;
    }

    public String getNome(){return this.nome;}
    public void setNome(String n){this.nome = n;}

    public boolean addIngrediente(Alimento a){
        if(num == alimento.length){
            Alimento [] tmp = new Alimento[num+10];
            System.arraycopy(alimento, 0, tmp, 0, num);
            alimento = tmp;
        }
        alimento[num++] = a;
        return true;
    }

    @Override
    public String toString(){
        return " Prato " + nome + " , composto por " + num + " Ingredientes";
    }
}
