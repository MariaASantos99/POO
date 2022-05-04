package Aula05;

import java.util.Scanner;

public class Biblioteca {
    Scanner sc = new Scanner(System.in);
    private static Utilizador[] utilizadores = new Utilizador[100];
    private static Livro[] livros = new Livro[100];
    private static int u=0, l=0;

    //Inserir um novo utilizador
    public void insertUtilizador(){
        
        System.out.print("Nome do utilizador: ");
        String nome = sc.nextLine();
        System.out.print("Numero mecanográfico: ");
        int nmec = sc.nextInt();
        sc.nextLine();
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        if(u == utilizadores.length){
            System.out.println("Cheio! Não é permitido mais utilizadores\n");
        }else{
            utilizadores[u++] = new Utilizador(nome, nmec, curso);
            System.out.println("Utilizador introduzido!\n");
        }
        
    }
    
    //Remover um utilizador
    public void removeUtilizador(int nmec){
        for(int i = 0; i< u; i++){
            if(utilizadores[i].getnMec() == nmec){
                utilizadores[i] = null;
                u--;
                System.out.println("Utilizador removido!\n");
                break;
            }
        }
    }

    //Imprimir utilizadores
    public void printUtilizador(){
        if(u == 0){
            System.out.println("Não existem utilizadores!\n");
        }else{
            for(int i = 0; i < u; i++){
                System.out.println(utilizadores[i]);
            }
            System.out.println("");
        }
    }

    //Registar novo Livro
    public void insertBook(){
        sc.nextLine();
        System.out.print("Titulo do livro: ");
        String book = sc.nextLine();
        if(l == livros.length){
            System.out.println("Cheio! Não há mais espaço para livros\n");
        }else{
            livros[l++] = new Livro(book);
            System.out.println("Novo livro registado!\n");
        }
    }

    //Imprimir os livros
    public void printBook(){
        if(l == 0){
            System.out.println("Não existem livros! \n");
        }else{
            for(int i = 0; i < l; i++){
                System.out.println(livros[i]);
            }
            System.out.println();
        }
    }

    //Emprestar Livro
    public void emprestar(int id, int nmec){
        int index = -1;
        boolean liv = false;
        if(l == 0 || u == 0){
            System.out.println("Não existem livro/utilizadores!");
        }else{
            for(int i = 0; i < u; i++){
                if(utilizadores[i].getnMec() == nmec){
                    index = i;
                    break;
                }
            }
            if(index != -1){
                for(int j = 0; j < l; j++){
                    if(livros[j].getId() == id){
                        liv = true;
                        utilizadores[index].emprestimo(livros[j]);
                        break;
                    }
                }
                if(!liv){System.out.println("Livro não existe!");}
            }else{
                System.out.println("Utilizador não existe!");
            }
        }
        System.out.println("");
    }

    //Devolver Livro
    public void devolver(int id, int nmec){
        int index = -1;
        boolean liv = false;
        if(l == 0 || u == 0){
            System.out.println("Não existem livro/utilizadores!");
        }else{
            for(int i = 0; i < u; i++){
                if(utilizadores[i].getnMec() == nmec){
                    index = i;
                    break;
                }
            }
            if(index != -1){
                for(int j = 0; j < l; j++){
                    if(livros[j].getId() == id){
                        liv = true;
                        utilizadores[index].devolvendo(livros[j]);
                        break;
                    }
                }
                if(!liv){System.out.println("Livro não existe!");}
            }else{
                System.out.println("Utilizador não existe!");
            }
        }
        System.out.println("");
    }

}
