package Orientacao_Objetoss.Heranca.test;

import Orientacao_Objetoss.Heranca.dominio.Endereco;
import Orientacao_Objetoss.Heranca.dominio.Funcionario;
import Orientacao_Objetoss.Heranca.dominio.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("021212-211");
        Pessoa pessoa = new Pessoa("Toyohisa");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("========");
        Funcionario funcionario = new Funcionario("Naruto");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
