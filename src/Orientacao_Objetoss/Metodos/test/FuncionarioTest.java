package Orientacao_Objetoss.Metodos.test;

import Orientacao_Objetoss.Metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] Args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João";
        funcionario.idade = 20;
        funcionario.salario = new double[]{1200, 200, 500};

        funcionario.imprime();

    }
}
