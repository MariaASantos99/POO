package Aula08;

public class AutomoveLigeiroElect extends AutomoveLigeiro implements VeiculoEletrico{
    private int km = 0, autonomia = 0;

    AutomoveLigeiroElect(String mat, String mod, String marc, double p, String num, int cap, int km){
        super(mat, mod, marc, p, num, cap);
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
    String getType(){return "Automovel Ligeiro Elétrico";}

    @Override
    public String toString(){
        return getType() + " que " + super.toString();
    }    
}
