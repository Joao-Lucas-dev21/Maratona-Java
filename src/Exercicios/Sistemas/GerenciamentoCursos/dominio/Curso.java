package Exercicios.Sistemas.GerenciamentoCursos.dominio;

public class Curso {
    protected String nome;
    protected int duracaoHoras;
    protected NivelCurso nivelCurso;
    private static int totalCursosCriado = 0;

    public Curso(String nome, int duracaoHoras, NivelCurso nivelCurso) {
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
        this.nivelCurso = nivelCurso;
        totalCursosCriado++;
    }

    public static int getTotalCursosCriado(){
        return totalCursosCriado;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public NivelCurso getNivelCurso() {
        return nivelCurso;
    }
}
