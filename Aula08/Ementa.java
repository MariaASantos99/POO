package Aula08;

//import java.util.Arrays;

public class Ementa {
    
    private String nome;
    private String local;
    private Prato[] pratos = new Prato[DiaSemana.values().length];
    private DiaSemana[] diaSemanas = new DiaSemana[DiaSemana.values().length];
    private int n = 0;

    Ementa(String n, String l){
        nome = n;
        local = l;
    }

    public String getNome(){return this.nome;}
    public void setNome(String n){this.nome = n;}
    public String getLocal(){return this.local;}
    public void setLocal(String l){this.local = l;}

    void addPrato(Prato p, DiaSemana d){
        if(n == pratos.length){
            Prato[] tmp = new Prato[n+10];
            DiaSemana[] tmp1 = new DiaSemana[n+10];
            System.arraycopy(pratos, 0, tmp, 0, n);
            pratos = tmp;
            System.arraycopy(diaSemanas, 0, tmp1, 0, n);
            diaSemanas = tmp1;
        }
        pratos[n] = p;
        diaSemanas[n++] = d;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i=0; i<n; i++){
            s += pratos[i].toString() + ", dia " + diaSemanas[i] + "\n ";
        }
        return s;
    }
}
