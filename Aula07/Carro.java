package Aula07;

public class Carro {
    private char classe;
    private String tipoMot;
    private boolean disponibilidade = true;
    private int id;
    private static int count = 1;

    Carro(char classe, String tipoMot){
        id = count++;
        switch(classe){
            case 'A': case 'B': case 'C': case 'D': case 'E': case 'F':
                this.classe = classe;
                break;
            default:
                this.classe = 'A';
                break;
        }
        if(tipoMot.toLowerCase().equals("gasoleo") || tipoMot.toLowerCase().equals("gasolina") || tipoMot.toLowerCase().equals("hibrido") || tipoMot.toLowerCase().equals("eletrico")){
            this.tipoMot = tipoMot;
        }else{ this.tipoMot = "gasoleo"; }
    }

    int getId(){return this.id;}
    
    char getClasse(){return this.classe;}
    void setClasse(char c){this.classe = c;}

    String getTipoMot(){return this.tipoMot;}
    void setTipoMot(String tpMot){this.tipoMot = tpMot;}

    boolean getDisp(){return this.disponibilidade;}

    void levantar(){this.disponibilidade = false;}
    void entregar(){this.disponibilidade = true;}

    @Override
    public String toString(){
        return "Carro " + this.id + ", classe: " + this.classe + 
            ", tipo do motorização: " + this.tipoMot + ", disponibilidade: " + this.disponibilidade;
    }
}
