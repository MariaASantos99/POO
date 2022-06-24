package Aula11;

//import java.io.File;
import java.io.IOException;
//import java.io.PrintWriter;
import java.nio.file.*;
import java.util.*;

public class Ex11_2 {
    public static void main(String[]args) throws IOException{

        //Adicionar a informação referente a cada voo
        ArrayList<ArrayList<String>> listaVoos = new ArrayList<>();
        List<String> info = Files.readAllLines(Paths.get("src/Aula11/voos.txt"));

        for(int i = 1; i < info.size(); i++){
            ArrayList<String> voo = new ArrayList<>();
            String[] informacao = info.get(i).split("\t");
            for(String inf : informacao){
                voo.add(inf);
            }
            if(informacao.length<4){voo.add("00:00");}
            listaVoos.add(voo);
        }

        //Adicionar a informação das companhias num dicionario, onde a key = Siglas e o value = Companhias
        HashMap<String,String> dicComp = new HashMap<>();
        List<String> dados = Files.readAllLines(Paths.get("src/Aula11/companhias.txt"));
        for(int i = 0; i <dados.size(); i++){
            String[] informacao = dados.get(i).split("\t");
            dicComp.put(informacao[0], informacao[1]);
        }

        //Alinea a)
        ArrayList<Voo> voos = new ArrayList<>();
        for(ArrayList<String> voo : listaVoos){
            String companhia = dicComp.get(voo.get(1).substring(0,2));
            voos.add(new Voo(new Tempo(voo.get(0)), voo.get(1), companhia, voo.get(2), new Tempo(voo.get(3))));
        }
        System.out.printf("%-8s %-10s %-25s %-25s %-8s %s\n", "HORA", "VOO", "Companhia", "Origem", "Atraso", "Obs");
        for(Voo i : voos){
            if(i.getAtraso().diferenca(new Tempo("00:00")) == 0){
                System.out.printf("%15s %15s %25s %25s\n",i.getHora(), i.getVoo(), i.getCompanhia(), i.getOrigem());
            }else{
                System.out.println(i);
            } 
        }

        //Alinea b)
/**        File filenew = new File("src/Aula11/Infopublico.txt");
        if(!filenew.exists()){
            filenew.createNewFile();
            System.out.println("Ficheiro criado com sucesso!");
        }
        PrintWriter print = new PrintWriter(filenew);

        print.printf("%s %15s %25s %25s %10s %10s \n", "HORA", "VOO", "Companhia", "Origem", "Atraso", "Obs");
        for(Voo i : voos){
            if(i.getAtraso().diferenca(new Tempo("00:00")) == 0){
                print.printf("%s %15s %25s %25s\n",i.getHora(), i.getVoo(), i.getCompanhia(), i.getOrigem());
            }else{
                print.println(i);
            } 
        }
        print.close();
*/
/*
        System.out.println(voos.size());

        for(Voo v : voos){
            System.out.println(v.getCompanhia());
        }
        //Alinea c) não funciona porque diz que o ArrayList é null e não deixa colocar nada
        Map<String,ArrayList<Integer>> inf = new TreeMap<>();
        ArrayList<Integer> atrasos = new ArrayList<>();
        for(Voo v : voos){
            System.out.println(v.getCompanhia());
            if(!inf.containsKey(v.getCompanhia())){
                inf.put(v.getCompanhia(), new ArrayList<Integer>());
            }
            atrasos = inf.get(v.getCompanhia());
            int value = v.getAtraso().getTempo();
            atrasos.add(value);
            inf.put(v.getCompanhia(), atrasos);
        } */
    } 
}
