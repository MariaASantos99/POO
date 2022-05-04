package Aula05;

import java.util.Scanner;
public class teste {
    public static Scanner sc = new Scanner(System.in);
    public static Utilizador[] utilizadores = new Utilizador[100];
    public static Livro[] livros = new Livro[100];
    public static int u = 0, l = 0;

    public static void insertUtilizador(){
        System.out.print("Nome do utilizador: ");
        String nome = sc.next();
        System.out.print("Numero mecanográfico: ");
        int nmec = sc.nextInt();
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        if(u == utilizadores.length){
            System.out.println("Cheio! Não é permitido mais utilizadores");
        }else{
            utilizadores[u++] = new Utilizador(nome, nmec, curso);
            System.out.println("Utilizador introduzido!");
        }
    }

    public static void insertBook(){
        sc.nextLine();
        System.out.print("Titulo do livro: ");
        String book = sc.nextLine();
        if(l == livros.length){
            System.out.println("Cheio! Não há mais espaço para livros");
        }else{
            livros[l++] = new Livro(book);
            System.out.println("Novo livro registado!");
        }
    }

    public static void printBook(){
        if(l == 0){
            System.out.println("Não existem livros! \n");
        }else{
            for(int i = 0; i < l; i++){
                System.out.println(livros[i]);
            }
        }
    }

    public static void main(String[] args){
        int op = -1;
        do{
            sc = new Scanner(System.in);
            System.out.print("Gestão da Biblioteca: \n" +
                            "1 - Inscrever utilizador \n" + 
                            "2 - Remover utilizador \n" +
                            "3 - Imprimir lista de utilizadores \n" +
                            "4 - Registar um novo livro \n" +
                            "5 - Imprimir lista de livros \n" +
                            "6 - Emprestar \n" +
                            "7 - Devolver \n" +
                            "8 - sair \n");
            System.out.print("Opção: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    insertUtilizador();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    insertBook();
                    break;
                case 5:
                    printBook();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("A sair...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção não válida!");
                    break;
            }
        }while(op!=8);
        sc.close();
    }
    
}
