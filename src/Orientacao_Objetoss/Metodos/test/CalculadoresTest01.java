package Orientacao_Objetoss.Metodos.test;

import Orientacao_Objetoss.Metodos.dominio.Calculadora;

public class CalculadoresTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
    }
}
