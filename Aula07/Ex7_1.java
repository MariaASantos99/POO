package Aula07;

import java.util.Scanner;

public class Ex7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=-1;
        Triangulo[] triangulos = new Triangulo[1];
        int countT = 0;
        Circulo[] circulos = new Circulo[1];
        int countC = 0;
        Retangulo[] retangulos = new Retangulo[1];
        int countR = 0;
        do{
            System.out.print("Figuras: \n" +
                            "1 - Criar Triangulo \n" + 
                            "2 - Criar Circulo \n" +
                            "3 - Criar Retangulo \n" +
                            "0 - exit \n");
            System.out.print("Opção: ");
            op = sc.nextInt();
           switch(op){
                case 0:
                System.out.println("A terminar...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Lado1: ");
                    double l1 = sc.nextDouble();
                    System.out.print("Lado2: ");
                    double l2 = sc.nextDouble();
                    System.out.print("Lado3: ");
                    double l3 = sc.nextDouble();
                    System.out.print("Cor da forma: ");
                    String cor = sc.next();
                    if(countT == triangulos.length){
                        Triangulo[] copyTriangulos = new Triangulo [triangulos.length+5];
                        System.arraycopy(triangulos, 0, copyTriangulos, 0, countT);
                        triangulos = copyTriangulos;
                    }
                    Triangulo t = new Triangulo(l1, l2, l3, cor);
                    System.out.println(t);
                    if(countT > 0){
                        for(int i=0; i<countT; i++){
                            if(t.equals(triangulos[i])){
                                System.out.printf("%s e %s  são iguais!\n",t,triangulos[i]);
                            }else{
                                System.out.printf("%s e %s  não são iguais!\n",t,triangulos[i]);
                            }
                        }
                    }
                    triangulos[countT++]=t;
                    break;
                case 2:
                    System.out.print("Raio: ");
                    double raio = sc.nextDouble();
                    System.out.print("Cor da forma: ");
                    String cor1 = sc.next();
                    if(countC == circulos.length){
                    Circulo[] copyCirculos = new Circulo [circulos.length+5];
                    System.arraycopy(circulos, 0, copyCirculos, 0, countC);
                    circulos = copyCirculos;
                    }
                    Circulo c = new Circulo(raio, cor1);
                    System.out.println(c);
                    if(countC > 0){
                        for(int i=0; i<countC; i++){
                            if(c.equals(circulos[i])){
                                System.out.printf("%s e %s  são iguais!\n",c,circulos[i]);
                            }else{
                                System.out.printf("%s e %s  não são iguais!\n",c,circulos[i]);
                            }
                        }
                    }
                    circulos[countC++]=c;
                    break;
                case 3:
                    System.out.print("Comprimento: ");
                    double comprimento = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    System.out.print("Cor da forma: ");
                    String cor2 = sc.next();
                    if(countR == retangulos.length){
                    Retangulo[] copyRetangulos = new Retangulo [retangulos.length+5];
                    System.arraycopy(retangulos, 0, copyRetangulos, 0, countR);
                    retangulos = copyRetangulos;
                    }
                    Retangulo r = new Retangulo(comprimento,altura, cor2);
                    System.out.println(r);
                    if(countR > 0){
                        for(int i=0; i<countR; i++){
                            if(r.equals(retangulos[i])){
                                System.out.printf("%s e %s  são iguais!\n",r,retangulos[i]);
                            }else{
                                System.out.printf("%s e %s  não são iguais!\n",r,retangulos[i]);
                            }
                        }
                    }
                    retangulos[countR++]=r;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
           }

        }while(op != 0);
        sc.close();
    }
}
