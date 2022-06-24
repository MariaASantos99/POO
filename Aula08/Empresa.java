package Aula08;

import java.util.Arrays;

public class Empresa {
    private Veiculos veiculos[] = new Veiculos[20];
    private String nome;
    private String email;
    private String codpostal;
    private int num = 0;
    
    Empresa(String nome, String email, String codpostal){
        this.nome = nome;
        this.email = email;
        this.codpostal = codpostal;
    }

    String getNome(){return this.nome;}
    void setNome(String n){this.nome = n;}

    String getEmail(){return this.email;}
    void setEmail(String email){this.email = email;}

    String getCodPostal(){return this.codpostal;}
    void setCodPostal(String cp){this.codpostal = cp;}

    Veiculos[] getVeiculos(){return this.veiculos;}

    int getNum(){return this.num;}

    void addVeiculo(Veiculos v){
        if(num == veiculos.length){
            Veiculos [] temp = new Veiculos[num+10]; 
            System.arraycopy(veiculos, 0, temp, 0, num);
            veiculos = temp;
        }
        veiculos[num++] = v;
    }

    void printVeiculos(){
        for(Veiculos v : veiculos){
            if(v != null){
                System.out.print(v);
            }else {break;}
            System.out.println();
        }
    }

    @Override
    public String toString(){
        return "Empresa de aluguer de viaturas " + getNome() + "; " + getCodPostal()+ 
        " email: " + getEmail() +" \n Viaturas: \n" + Arrays.toString(veiculos);
    }
    
}
