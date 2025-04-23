package Exercicios;

import java.util.Scanner;
//Faça um algoritmo para receber um número qualquer e imprimir na tela
// se o número é par ou ímpar, positivo ou negativo.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um número para saber se é par ou ímpar, negativo ou positivo: ");
        int num = dados.nextInt();

        if (num % 2 == 0 ){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
        if (num > 1){
            System.out.println("Número positivo");
        } else{
            System.out.println("Número negativo");
        }
    }
}
