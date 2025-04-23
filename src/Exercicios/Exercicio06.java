package Exercicios;
//Faça um algoritmo que leia um valor qualquer e imprima na tela
// com um reajuste de 5%.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = dados.nextInt();
        System.out.println("Reajuste de 5%");
        double valorReajustado = valor + valor * 0.05;
        System.out.println("Resultado: " + valorReajustado);
    }
}
