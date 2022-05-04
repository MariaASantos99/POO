package Aula05;

public class Livro {
    private int id;
    private static int count = 100;
    private String titulo;
    private String tipoEmprestimo;

    public Livro(String titulo){
        this.titulo = titulo;
        this.tipoEmprestimo = "NORMAL";
        this.id = count++;
    }

    public Livro (String titulo, String tipoEmprestimo){
        assert tipoEmprestimo == "NORMAL" || tipoEmprestimo == "CONDICIONAL" : "Entrada inválida!";
        this.id = count++;
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public int getId(){return this.id;}
    public String getTitulo(){return this.titulo;}
    public String getTipoEmprestimo(){return this.tipoEmprestimo;}

    public void setTipoEmprestimo(String newTEmp){ 
        assert tipoEmprestimo == "NORMAL" || tipoEmprestimo == "CONDICIONAL" : "Entrada inválida!";
        this.tipoEmprestimo = newTEmp;
    }

    public String toString(){
        return "Livro " + id + ", " + titulo + ", " + tipoEmprestimo;
    }
}
