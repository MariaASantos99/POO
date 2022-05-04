package Aula03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = false;
        double notaP=0.0, notaT = 0.0;
        do{
            try{
                System.out.println("Nota obtida na componente prática: ");
                notaP = sc.nextDouble();
                System.out.println("Nota obtidade na componente teórica: ");
                notaT = sc.nextDouble();
                valida = true;
            }catch(InputMismatchException ex){
                System.out.println("Formatação errada!");
                sc.nextLine();
                valida = false;
            }
        }while( !valida || (notaP<0 || notaP>20) || (notaT<0 || notaT>20));
        if (notaP < 7 || notaT < 7){
            System.out.println("66 (reprovado por nota minima)");
        }else{
            System.out.printf("Nota Final: %02d",(int)(0.4*notaT + 0.6*notaP));
        }

        sc.close();
    }

}
