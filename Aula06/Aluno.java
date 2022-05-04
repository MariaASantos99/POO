package Aula06;
import java.time.LocalDateTime;

public class Aluno extends Pessoa{
    private static int count = 100;
    private int nmec;
    private Date dataIns;
    private LocalDateTime now = LocalDateTime.now();

    Aluno(String nome, int cc, Date dataNasc,Date dataIns){
        super(nome,cc,dataNasc);
        this.dataIns = dataIns;
        this.nmec = count++;
    }
    Aluno(String nome, int cc, Date dataNasc){
        super(nome,cc,dataNasc);
        this.dataIns = new Date(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
        this.nmec = count++;
    }

    int getNMec(){return this.nmec;}
    Date getDataIns(){return this.dataIns;}
    
    @Override
    public String toString(){
        return super.toString() + "; NMec: " + getNMec() + "; Data de inscrição: " + getDataIns();
    }
}
