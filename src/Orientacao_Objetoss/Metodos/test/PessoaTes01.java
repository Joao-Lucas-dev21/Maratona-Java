package Orientacao_Objetoss.Metodos.test;

import Orientacao_Objetoss.Metodos.dominio.Pessoas;

public class PessoaTes01 {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();

        pessoas.setNome("João");
        pessoas.setIdade(20);

        System.out.println(pessoas.getNome());
        System.out.println(pessoas.getIdade());

    }
}
