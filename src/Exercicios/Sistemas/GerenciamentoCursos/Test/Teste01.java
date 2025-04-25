package Exercicios.Sistemas.GerenciamentoCursos.Test;

import Exercicios.Sistemas.GerenciamentoCursos.dominio.Aluno;
import Exercicios.Sistemas.GerenciamentoCursos.dominio.Curso;
import Exercicios.Sistemas.GerenciamentoCursos.dominio.Instrutor;
import Exercicios.Sistemas.GerenciamentoCursos.dominio.NivelCurso;

public class Teste01 {
    public static void main(String[] args) {
        Curso java = new Curso("Java Básico", 10, NivelCurso.BASICO);
        Curso python = new Curso("Python Avançado", 10, NivelCurso.AVANCADO);
        Curso[] listaCursos = new Curso[]{java, python};

        Instrutor instrutor1 = new Instrutor("Josifredo", "josifredo@dominio.com", "Programação", 2000);

        Aluno aluno1 = new Aluno("João", "joaolucas@dominio.com", "PG123", listaCursos);

        aluno1.mostrarDados();
        System.out.println("=====================");
        instrutor1.mostrarDados();
        System.out.println("=====================");
        System.out.println("Total de cursos criados: "+ Curso.getTotalCursosCriado());

    }
}
