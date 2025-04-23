package Exercicios;

import java.util.Scanner;
//Faça um algoritmo que leia dois valores inteiros A e B, se os
// valores de A e B forem iguais, deverá somar os dois valores,
//aso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos
// deve-se atribuir o resultado a uma variável C e
//imprimir seu valor na tela.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int A = dados.nextInt();
        System.out.println("Digite outro valor: ");
        int B = dados.nextInt();
        if (A == B) {
            int soma = A + B;
            System.out.println("Número igual, a soma entre eles é: " + soma);
        } else {
            int c = A * B;
            System.out.println("Número diferentes, a multiplicação entre eles é: " + c);
        }
    }
}