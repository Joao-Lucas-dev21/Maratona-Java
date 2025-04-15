package Exercicios.test;

import Exercicios.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.setNome("João");
        estudante1.setIdade(20);
        estudante1.setNotas(new double[] {5.5, 8.2, 10});

        estudante2.setNome("Damaris");
        estudante2.setIdade(21);
        estudante2.setNotas(new double[] {7, 8, 7.2});

        estudante1.calcularMedia();
        estudante2.calcularMedia();
    }
}
