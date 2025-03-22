package Exercicios;

public class Exercicio03 {
    public static void main(String[] args){
        //3 - Faça um algoritmo que leia dois valores inteiros A e B,
        // se os valores de A e B forem iguais, deverá somar os dois valores,
        // caso contrário devera multiplicar A por B. Ao final de qualquer um
        // dos cálculos deve-se atribuir o resultado a uma variável C e
        //imprimir seu valor na tela.

        int a = 6;
        int b = 3;

        if (a == b){
            int c = a + b;
            System.out.print("Números iguais, a soma entre eles é: "+ c);
        } else {
            int c = a * b;
            System.out.print("Números diferentes, a multiplicação entre eles é: "+ c);
        }
    }
}
