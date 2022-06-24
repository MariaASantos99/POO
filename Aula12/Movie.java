package Aula12;

public class Movie {
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int runTime;

    public Movie(String name, double score, String rating, String genre, int runTime){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runTime = runTime;
    }

    //Gets e Sets
    String getName(){return this.name;}
    void  setName(String n){name = n;}

    double getScore(){return this.score;}
    void setScore(double s){score = s;}

    String getRatting(){return this.rating;}
    void setRatting(String r){rating = r;}

    String getGenre(){return this.genre;}
    void setGenre(String g){genre = g;}

    int getRunTime(){return this.runTime;}
    void setRunTime(int r){runTime = r;}

    @Override
    public String toString(){
        return String.format("%-40s%-8.2f%-8s%-10s%d", name, score, rating, genre, runTime);
    }


}
