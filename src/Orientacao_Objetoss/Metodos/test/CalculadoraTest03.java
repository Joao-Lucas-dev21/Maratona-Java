package Orientacao_Objetoss.Metodos.test;

import Orientacao_Objetoss.Metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);

        System.out.println(resultado);

        System.out.println("------------");
        calculadora.executaMetodo(86, 2);
    }


}
