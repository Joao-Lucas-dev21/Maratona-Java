package Exercicios.dominio;

// Crie um sistema que gerêncie seminários

// O sistema deverá cadastrar seminários, estudantes, professores, e local onde será realizado

// Um aluno poderá estar em apenas um seminário
// Um seminário poderá ter nenhum ou vários alunos
// Um professor poderá ter vários seminários
// Um seminário deve ter um local

// Campos básicos (excluindo relacionamento)
// Seminario: Titúlo
// Aluno: nome e idade
// Professor: nome, especialidade
// Local: endereço

import Orientacao_Objetoss.Associacao.dominio.Seminarios;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void imprimi(Aluno aluno, Local local){
        System.out.println("== Alunos ==");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());

        System.out.println("== Seminário ==");
        System.out.println(getTitulo());

        System.out.println("== Local ==");
        System.out.println(local.getEnedereco());
    }
}
