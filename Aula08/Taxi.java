package Aula08;

public class Taxi extends AutomoveLigeiro{
    
    private int licenca;

    Taxi(String mat, String mod, String marc, double p, String num, int cap, int li){
        super(mat, mod, marc, p, num, cap);
        licenca = li;
    }

    int getLicenca(){return this.licenca;}
    void setLicenca(int l){this.licenca = l;}

    @Override
    String getType(){return super.getType() + "(Taxi)";}

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){return false;}
        Taxi m = (Taxi) obj;
        return this.getMarca() == m.getMarca() && this.getModelo() == m.getModelo();
    }

    @Override
    public String toString(){
        return "É um taxi que " + super.toString();
    }
}
