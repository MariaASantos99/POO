package Aula11;

public class Voo {
    private Tempo hora;
    private String voo;
    private String companhia;
    private String origem;
    private Tempo atraso; 
    private Tempo previsao;

    public Voo(Tempo h, String v, String c, String or, Tempo a){
        hora = h; voo = v;
        companhia = c;
        origem = or; atraso = a;
        previsao = h.difTempo(a);
    }

    public Tempo getHora(){return hora;}
    public String getVoo(){return voo;}
    public String getCompanhia(){return companhia;}
    public String getOrigem(){return origem;}
    public Tempo getAtraso(){return atraso;}
    public Tempo getPrevisao(){return previsao;}

    @Override
    public String toString(){
        return String.format("%-8s %-10s %-25s %-25s %-8s Previsao: %s", hora,voo,companhia,origem,atraso,previsao);
    }

}
