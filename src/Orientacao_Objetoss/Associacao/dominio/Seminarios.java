package Orientacao_Objetoss.Associacao.dominio;

public class Seminarios {
    private String titulo;
    private Aluno[] aluno;
    private Local local;

    public Seminarios() {

    }

    public Seminarios(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
