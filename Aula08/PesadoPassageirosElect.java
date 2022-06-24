package Aula08;

public class PesadoPassageirosElect extends PesadoPassageiros{
    private int km = 0, autonomia=0;
    PesadoPassageirosElect(String mat, String mod, String marc, double p,String num, double peso, double max, int km){
        super(mat, mod, marc, p,num,peso,max);
        this.km = km;
        this.autonomia = this.km;
    }

    @Override
    public void trajeto(int quilometros){
        super.trajeto(quilometros);
        this.autonomia = this.autonomia -  quilometros;
    }
    
    public int autonomia(){
        return autonomia;
    }

    public void carregar(int percentagem){
        int perDisp = (this.autonomia * 100) / km;
        if(percentagem > perDisp){
            this.autonomia = (percentagem*km) / 100;
            System.out.println("Automovel carregado!");
        }else{System.out.println("A percentagem atual já é superior!");}
    }

    @Override
    String getType(){return "Pesado de Passageiros Elétrico";}

    @Override
    public String toString(){
        return getType() + " que " + super.toString();
    }
}
