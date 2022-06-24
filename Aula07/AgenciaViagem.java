package Aula07;

import java.util.Arrays;

public class AgenciaViagem {
    private Alojamento[] alojamentos = new Alojamento[10];
    private Carro[] carros = new Carro[10];
    private int a = 0, c = 0;
    private String nome;
    private String endereco;

    AgenciaViagem(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    String getNome(){return this.nome;}
    void setNome(String nome){this.nome = nome;}

    String getEnd(){return this.endereco;}
    void setEnd(String end){this.endereco = end;}

    Alojamento[] getAl(){return this.alojamentos;}
    Carro[] getCar(){return this.carros;}

    void addAl(Alojamento al){
        if(a == alojamentos.length){
            Alojamento [] temp = new Alojamento[a+10]; 
            System.arraycopy(alojamentos, 0, temp, 0, a);
            alojamentos = temp;
        }else{
            alojamentos[a++] = al;
        }
        
    }

    void addCar(Carro car){
        if(c == carros.length){
            Carro [] temp = new Carro[c+10]; 
            System.arraycopy(carros, 0, temp, 0, c);
            carros = temp;
        }else{
            carros[c++] = car;
        }
    }

    void printRooms(){
        for(Alojamento al : alojamentos){
            if(al instanceof Quarto){
                System.out.println(al);
            }
        }
    }

    void printAparts(){
        for(Alojamento al : alojamentos){
            if(al instanceof Apartamento){
                System.out.println(al);
            }
        }
    }

    void printCars(){
        for(Carro car : carros){
            if(car != null){
                System.out.println(car);
            }            
        }
    }

    @Override
    public String toString(){
        return "Agencia de Viagem " + this.nome + "em " + this.endereco + 
            "\n Alojamentos: " + Arrays.toString(alojamentos) + "Carros: " + Arrays.toString(carros);
    }
}
