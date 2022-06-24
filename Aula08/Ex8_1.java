package Aula08;

import java.util.Scanner;

public class Ex8_1 {    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Agencia Aveiro", "bastaligar@gmail.com", "3800-123");

        //Adicionar informação na Empresa
        empresa.addVeiculo(new Motociclo("00-AA-00","XRS700","Yamaha","estrada", 74));
        empresa.addVeiculo(new Motociclo("00-AA-01","XRS700","Yamaha","estrada", 74));
        empresa.addVeiculo(new AutomoveLigeiro("00-BB-00", "A180", "Mercedes-Benz", 122, "AA123", 360));
        empresa.addVeiculo(new AutomoveLigeiro("00-BB-01", "A180", "Mercedes-Benz", 122, "AA123", 360));
        empresa.addVeiculo(new AutomoveLigeiro("00-BB-02", "Urus", "Lamborghini", 650, "CC123", 616));
        empresa.addVeiculo(new Taxi("00-CC-01", "Versa", "Nissan", 111, "EE123", 460, 156));
        empresa.addVeiculo(new PesadoMercadorias("00-DD-00", "Mod1", "Iveco", 210, "FF321", 1200, 1900));
        empresa.addVeiculo(new PesadoPassageiros("00-EE-00", "Citaro", "Mercedes-Benz", 307, "GG987", 1200, 1900));
        empresa.addVeiculo(new AutomoveLigeiroElect("00-BB-02", "Urus", "Lamborghini", 650, "CC123", 616, 1000));
        empresa.addVeiculo(new PesadoPassageirosElect("00-EE-00", "Citaro", "Mercedes-Benz", 307, "GG987", 1200, 1900, 2000));
             
        Veiculos[]  veiculos = empresa.getVeiculos();
        
        //KmPercorridos
        veiculos[0].trajeto(10);
        veiculos[1].trajeto(5);
        veiculos[2].trajeto(20);
        veiculos[3].trajeto(15);
        veiculos[4].trajeto(25);
        veiculos[5].trajeto(30);
        veiculos[6].trajeto(200);
        veiculos[7].trajeto(100);
        veiculos[8].trajeto(20);
        veiculos[9].trajeto(90);
        veiculos[0].trajeto(5);
        veiculos[1].trajeto(5);
        veiculos[2].trajeto(10);
        veiculos[3].trajeto(10);
        veiculos[4].trajeto(30);
        veiculos[5].trajeto(50);
        veiculos[6].trajeto(500);
        veiculos[7].trajeto(150);

        //imprime os veiculos da empresa
        System.out.println("Informacao da Empresa: ");
        empresa.printVeiculos();
        System.out.println();

        //Viatura com mais quilometros percorridos
        int pos= 0;
        int quilometros = veiculos[pos].distanciaTotal;
        for( int i=pos+1 ; i< empresa.getNum(); i++){
            if(quilometros < veiculos[i].distanciaTotal()){
                quilometros = veiculos[i].distanciaTotal();
                pos = i;
            }
        }
        System.out.println("A viatura com mais quilometros percorridos " + veiculos[pos]);

        //Ver quais os veiculos que são iguais
        if(empresa.getNum() == 0){
            System.out.println("Empresa não tem veiculos");
        }else{
            int count = empresa.getNum();
            for(int i = 0 ; i < count-1 ; i++){
                for(int j = i+1; j< count; j++){
                    if(veiculos[i].equals(veiculos[j])){
                        System.out.println("Veiculos são iguais:  " + veiculos[i].getType() + 
                            " (Marca: " + veiculos[i].getMarca() + ", Modelo: "+ veiculos[i].getModelo()+") ");
                    }else{
                        System.out.println("Veiculos são diferentes:  " + veiculos[i].getType() + 
                            " (Marca: " + veiculos[i].getMarca() + ", Modelo: "+ veiculos[i].getModelo()+") diferente de " + 
                            veiculos[j].getType() + " (Marca: " + veiculos[j].getMarca() + ", Modelo: "+ veiculos[j].getModelo() + ")");
                    }
                }
            }
        }
        
        veiculos[8].trajeto(80);
        System.out.println("\n ");
        for(Veiculos v : veiculos){
            if ( (v instanceof AutomoveLigeiroElect) ){
                AutomoveLigeiroElect electrico = ((AutomoveLigeiroElect) v);
                System.out.println(electrico.autonomia());
                electrico.carregar(91);
                System.out.println(electrico.autonomia());
            }
            if ( (v instanceof PesadoPassageirosElect) ){
                PesadoPassageirosElect electrico = ((PesadoPassageirosElect) v);
                System.out.println(electrico.autonomia());
                electrico.carregar(91);
                System.out.println(electrico.autonomia());
            }
        }
        System.out.println("\n " + empresa.getNum());
        //Ordernar os veiculos do menos potente para o mais potente
        if(empresa.getNum()>0){
            for(int i=0; i< empresa.getNum()-1; i++){
                for(int j=i+1; j< empresa.getNum(); j++){
                    double dif = Double.compare(veiculos[i].getPotencia(), veiculos[j].getPotencia());
                    if(dif > 0){
                        Veiculos tmp = veiculos[i];
                        veiculos[i] = veiculos[j];
                        veiculos[j] = tmp;
                    }
                }
            }
        }
        System.out.println("\n Veiculos por ordem crescente de potêmcia: ");
        for(int i=0; i < empresa.getNum(); i++){
            System.out.println(veiculos[i]);
        }

    }
}
