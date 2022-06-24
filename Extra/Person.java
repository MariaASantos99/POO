package POO_T10_87965;

public class Person {
    private String nome;
    private int cc;
    private Date dataNasc;

    Person(String nome, int cc, Date dataNasc){
        assert Integer.toString(cc).length() <= 8 && cc > 0 : "Entrada inválida";
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    String getName(){return this.nome;}
    int getCC(){return this.cc;}
    Date getDataNasc(){return this.dataNasc;}

    @Override
    public String toString(){
        return getName() + "; CC: " + getCC() + "; Data de Nascimento: " + getDataNasc();
    }
}
