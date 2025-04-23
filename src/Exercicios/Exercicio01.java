package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B
// é mostre se a soma é menor que C.
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        int a = dados.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = dados.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = dados.nextInt();

        int soma = a + b;
        System.out.println("A soma entre A e B é: "+soma);
        if (soma < c){
            System.out.println("A soma entra A e B é menor que C, valor de C: " + c);
        }
    }
}
