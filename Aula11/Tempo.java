package Aula11;

public class Tempo {
    private int minutos;

    public Tempo(String hora){
        String[] tempo = hora.split(":");
        minutos = (Integer.parseInt(tempo[0])*60 )+ Integer.parseInt(tempo[1]);
    }

    public Tempo(int min){minutos = min;}

    public int getTempo(){return this.minutos;}

    public void setTempo(int min){ this.minutos = min;}

    public Tempo difTempo(Tempo t){
        return new Tempo(this.minutos + t.minutos);
    }

    public int diferenca(Tempo t){return this.minutos - t.minutos;}

    @Override
    public String toString(){
        int hora = minutos/60;
        return hora + ":" + minutos%60;
    }
}
