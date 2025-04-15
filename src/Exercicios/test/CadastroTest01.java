package Exercicios.test;

import Exercicios.dominio.Aluno;
import Exercicios.dominio.Local;
import Exercicios.dominio.Professor;
import Exercicios.dominio.Seminario;

import java.util.Scanner;

public class CadastroTest01 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Seminario seminario = new Seminario();
        Local local1 = new Local();
        Professor professor1 = new Professor();

        System.out.println("== Bem vindo ao gerenciador de cadastro!! ==");

        System.out.println("Digite o nome do aluno abaixo: ");
        String nomeAluno = dados.nextLine();
        aluno1.setNome(nomeAluno);

        System.out.println("Digite a idade do aluno abaixo: ");
        int idadeAluno = dados.nextInt();
        aluno1.setIdade(idadeAluno);

        dados.nextLine();

        System.out.println("Digite o titúlo do seminario abaixo: ");
        String tituloSeminario = dados.nextLine();
        seminario.setTitulo(tituloSeminario);

        System.out.println("Digite o local abaixo: ");
        String enderecoLocal = dados.nextLine();
        local1.setEnedereco(enderecoLocal);

        System.out.println("Digite o nome do professor abaixo: ");
        String nomeProfessor = dados.nextLine();
        professor1.setNome(nomeProfessor);

        System.out.println("Digite a especialidade do professor abaixo: ");
        String especialidadeProfessor = dados.nextLine();
        professor1.setEspecialidade(especialidadeProfessor);

        professor1.imprime(seminario, aluno1,local1, professor1);
    }
}
