package Exercicios;

public class Exercicio01 {
    public static void main(String[] args){
        //1 - Faça um algoritmo que leia os valores de A, B, C
        // e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
        int a = 5;
        int b = 8;
        int c = 10;

        int soma = a + b;
        System.out.println(soma);
        if (soma < c){
            System.out.println("A soma entre A e B é menor que valor de C== "+ c);
        } else{
            System.out.println("A soma entre A e B é maior que valor de C "+ c);
        }
    }
}
