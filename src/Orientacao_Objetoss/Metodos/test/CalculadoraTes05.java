package Orientacao_Objetoss.Metodos.test;

import Orientacao_Objetoss.Metodos.dominio.Calculadora;

public class CalculadoraTes05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
