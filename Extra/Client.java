//package 87965;
package Maria_87965;

public class Client {
    private String nome, localidade;
    
    Client(String name, String local){
        nome = name; localidade = local;
    }

    String getName(){return this.nome;}
    String getLocal(){return this.localidade;}

    @Override
    public String toString(){
        return String.format("%s [%s]", nome, localidade);
    }

}
