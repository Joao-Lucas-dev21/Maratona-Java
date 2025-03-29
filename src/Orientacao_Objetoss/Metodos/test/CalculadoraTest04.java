package Orientacao_Objetoss.Metodos.test;

import Orientacao_Objetoss.Metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("=-=-=-=-=-=-=");

        System.out.println("Dentro da Calculadora");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
}
