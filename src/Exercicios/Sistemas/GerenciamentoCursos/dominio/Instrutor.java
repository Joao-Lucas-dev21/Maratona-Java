package Exercicios.Sistemas.GerenciamentoCursos.dominio;

public class Instrutor extends Pessoa{
    private final String especialidade;
    private final double salario;

    public Instrutor(String nome, String email, String especialidade, double salario) {
        super(nome, email);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome do Professor: " + this.nome);
        System.out.println("Especialidade do Professor: " + this.especialidade);
        System.out.println("Salário do Professor: " + this.salario);
        System.out.println("Email do Professor: " + this.email);
    }
}
