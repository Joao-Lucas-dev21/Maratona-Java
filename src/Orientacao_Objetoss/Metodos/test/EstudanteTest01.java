package Orientacao_Objetoss.Metodos.test;

import Orientacao_Objetoss.Metodos.dominio.Estudante;
import Orientacao_Objetoss.Metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Keiti";
        estudante01.idade = 45;
        estudante01.sexo = 'F';

        estudante02.nome = "Cicero";
        estudante02.idade = 65;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
