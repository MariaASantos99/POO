package Aula03;

import java.util.*;
public class Ex3_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] turma = new double[16][2];        
        for(int i=0; i<turma.length;i++){
            turma[i][0]= Math.random()*20;
            turma[i][1] = Math.random()*20;
        }
        System.out.println("NotaT  NotaP  Pauta");
        int pauta = 0;
        for(int k=0; k<turma.length; k++){
            if (turma[k][0] < 7 || turma[k][1] < 7){
                pauta = 66;
            }else{
                pauta = (int)(0.4*turma[k][1] + 0.6*turma[k][0]);
            }
            System.out.printf("%.2f  %3.2f  %5d\n",turma[k][0], turma[k][1],pauta);
        }
        sc.close();
    }
}
