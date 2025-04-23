package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A
// e imprima na tela os valores.
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int valorA = dados.nextInt();
        System.out.println("Digite o valor de B:");
        int valorB = dados.nextInt();

        int auxiliar = valorA;

        valorA = valorB;
        valorB = auxiliar;

        System.out.println("\nApós a troca:");
        System.out.println("valor de A: "+ valorA);
        System.out.println("valor de B: "+ valorB);


    }
}
