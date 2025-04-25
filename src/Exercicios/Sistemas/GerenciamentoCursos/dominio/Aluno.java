package Exercicios.Sistemas.GerenciamentoCursos.dominio;

public class Aluno extends Pessoa {
    protected String matricula;
    protected Curso[] cursos;

    public Aluno(String nome, String email, String matricula, Curso[] cursos) {
        super(nome, email);
        this.matricula = matricula;
        this.cursos = cursos;
    }

    public void matricularEmCursos(Curso[] novoscursos) {
        this.cursos = novoscursos;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Matricula do Aluno: " + this.matricula);
        System.out.println("Email do Aluno: " + this.email);
        System.out.println("Cursos matriculados: ");
        if (cursos == null) {
            System.out.println("- Nenhum curso Matriculado -");
        } else {
            for (Curso curso : cursos) {
                System.out.println("=-=-=-=-=-==-=-=-=-=-=");
                System.out.println("- " + curso.nome + " -");
                System.out.println("- " + curso.nivelCurso + " -");
                System.out.println("=-=-=-=-=-==-=-=-=-=-=");
            }
        }

    }
}
