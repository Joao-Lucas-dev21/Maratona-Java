package Exercicios;

import java.util.Scanner;

// Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
// Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * ( F-32) / 9)
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Qual a temperatura em Fahrenheit: ");
        double F = dados.nextDouble();
        double C = (5 * (F - 32) / 9);
        System.out.printf("Temperatura em Fahrenheit: %.2f%n", F);
        System.out.printf("Temperatura em Grau: %.2f", C);
    }
}
