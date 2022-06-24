package Aula09;

public class Pessoa {
    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa(String nome, int cc, Date dataNasc){
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

    @Override
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj == null || getClass() != obj.getClass()){return false;}
        Pessoa p = (Pessoa) obj;
        if(this.cc != p.getCC()){return false;}
        //Verificar as Datas de nascimento
        if(dataNasc == null){
            if(p.getDataNasc() != null){return false;}
        }else if(!dataNasc.equals(p.getDataNasc())){return false;}
        //Verificar o nome das pessoas
        if(nome == null){
            if(p.getName() != null){return false;}
        }else if(!nome.equals(p.getName())){return false;}
        return true;
    }

    @Override 
    public int hashCode(){
        return this.getName().hashCode() + this.getCC();
    }
}
