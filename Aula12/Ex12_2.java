package Aula12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Ex12_2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/Aula12/movies.txt"));
        ArrayList<Movie> listmovies = new ArrayList<>();
        Set<String> genre = new HashSet<>();
        for(int i = 1; i<lines.size(); i++){
            String[] info = lines.get(i).split("\t");
            listmovies.add(new Movie(info[0], Double.parseDouble(info[1]), info[2], info[3], Integer.parseInt(info[4])));
            genre.add(info[3]);
        }
        System.out.println("MOVIES: ");
        printMovies(listmovies);
        System.out.println("\n");

        //Ordenar por ordem decrescente em relação ao score
        listmovies.sort((a,b)->Double.compare(-a.getScore(), -b.getScore()));
		printMovies(listmovies);

        //Ordenar por ordem crescente em relação ao runnig time
        listmovies.sort((a,b)->Integer.compare(a.getRunTime(), b.getRunTime()));
        printMovies(listmovies);
        //System.out.println("\n");

        //Listar os generos distintos
        System.out.println("\n GENRE MOVIES: ");
        for(String g : genre){
            System.out.print(g + "  ");
        }
        System.out.println("");

        //Inserior num ficheiro os filmes que são de comédia e o score é superior a 60
        List<Movie> especiallyMovie = new ArrayList<>();
        for(Movie m : listmovies){
            if(m.getGenre().equals("comedy") && m.getScore() > 60.00){
                especiallyMovie.add(m);
            }
        }

        File filenew = new File("src/Aula12/myselection.txt");
        if(!filenew.exists()){
            filenew.createNewFile();
            System.out.println("\n Ficheiro criado com sucesso!");
        }
        PrintWriter print = new PrintWriter(filenew);
        print.println("-------------------------------------------------------------------------");
        print.printf("%-40s%-8s%-8s%-10s%s \n", "MOVIE", "SCORE", "RATING", "GENRE", "RUNNING TIME");
        for(Movie m : especiallyMovie){
            print.println(m);
        }
        print.close();
    }

    public static void printMovies(List<Movie> lista){
        System.out.println("-------------------------------------------------------------------------");
        for(Movie m : lista){
            System.out.println(m);
        }
    }
}
