package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Escolha um valor para ver a tabuada:");
        int valor = dados.nextInt();

        System.out.println("Tabuada do " + valor + ":");
        for (int i = 1; i <= 10; i++) {
            int result = valor * i;
            System.out.println(valor + "x" + i + " = " + result);
        }
    }
}
