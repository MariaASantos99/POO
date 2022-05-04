package Aula05;

public class Utilizador {
    private String nome;
    private int nMec, countBooks = 0;
    private String curso;
    private int[] livrosID = new int[3];

    public Utilizador(String nome, int nMec, String curso){
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    public String getNome(){return this.nome;}
    public int getnMec(){return this.nMec;}
    public String getCurso(){return this.curso;}

    public void setNome(String newName){ this.nome = newName;}
    public void setnMec(int newnMec){this.nMec = newnMec;}
    public void setCurso(String newCurso){this.curso = newCurso;}

    public String toString(){
        return "Aluno: " + nMec + ", " + nome + ", " + curso;
    }

    public void emprestimo(Livro li){
        if(countBooks == livrosID.length){
            System.out.println("Não pode fazer mais nenhum emprestimo!");
        }else{
            if(li.getTipoEmprestimo() == "CONDICIONAL"){
                System.out.println("Livro indisponivel!");
            }else{
                livrosID[countBooks++] = li.getId();
                li.setTipoEmprestimo("CONDICIONAL");
                System.out.println("Emprestimo de livro efetuado!");
            }
        }
    }

    public void devolvendo(Livro li){
        int j = -1;
        if(countBooks == 0){
            System.out.println("Não tem livros a devolver!");
        }else{
            for(int i = 0; i< countBooks; i++){
                if(livrosID[i] == li.getId()){
                    livrosID[i] = 0;
                    li.setTipoEmprestimo("NORMAL");
                    j = 0;
                    countBooks--;
                    System.out.println("Livro devolvido");
                    break;
                }
            }
            if(j < 0){System.out.println("Nao tem esse livro para devolver!");}
        }
    }
}
