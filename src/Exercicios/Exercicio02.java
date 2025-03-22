package Exercicios;

public class Exercicio02 {
    public static void main(String[] args){
        //2 - Faça um algoritmo para receber um número qualquer
        // e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        int numero = 35;
        if (numero % 2 == 0){
            System.out.println(numero + " Número par");
        } else{
            System.out.println(numero + " Número ímpar");
        }

        if (numero < 0) {
            System.out.println(numero + " Número negativo");
        } else {
            System.out.println(numero + " Número positivo");
        }
    }
}
