package Orientacao_Objetos.test;

import Orientacao_Objetos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "João";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Damaris";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);

        System.out.println("-------------------");

        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Sexo: " + estudante2.sexo);
    }
}
