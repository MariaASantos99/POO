package Aula05;

import java.util.Scanner;

public class Ex5_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(); 
        int op = -1;
        do{
            System.out.print("Gestão da Biblioteca: \n" +
                            "1 - Inscrever utilizador \n" + 
                            "2 - Remover utilizador \n" +
                            "3 - Imprimir lista de utilizadores \n" +
                            "4 - Registar um novo livro \n" +
                            "5 - Imprimir lista de livros \n" +
                            "6 - Emprestar \n" +
                            "7 - Devolver \n" +
                            "8 - sair \n");
            System.out.print("");
            System.out.print("Opção: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    biblioteca.insertUtilizador();
                    break;
                case 2:
                    System.out.print("Numero Mecanográfico: ");
                    int nmec = sc.nextInt();
                    biblioteca.removeUtilizador(nmec);
                    break;
                case 3:
                    biblioteca.printUtilizador();
                    break;
                case 4:
                    biblioteca.insertBook();
                    break;
                case 5:
                    biblioteca.printBook();
                    break;
                case 6:
                    System.out.print("Id do Livro: ");
                    int id = sc.nextInt();
                    System.out.print("Numero Mecanográfico: ");
                    int Nmec = sc.nextInt();
                    biblioteca.emprestar(id, Nmec);
                    break;
                case 7:
                    System.out.print("Id do Livro: ");
                    int ID = sc.nextInt();
                    System.out.print("Numero Mecanográfico: ");
                    int NMec = sc.nextInt();
                    biblioteca.devolver(ID, NMec);
                    break;
                case 8:
                    System.out.println("A terminar...");
                    System.exit(0);
                    break;
                default:
                System.out.println("Opção inválida!");
                    break;
            }
        }while(op != 0);
        sc.close();
    }
}
