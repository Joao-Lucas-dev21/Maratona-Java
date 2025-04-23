package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela
// o quociente e o resto da divisão inteira entre eles.
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Defina o valor A: ");
        int valorA = dados.nextInt();
        System.out.println("Defina o valor B: ");
        int valorB = dados.nextInt();

        int quociente = valorA / valorB;
        int resto = valorA % valorB;

        System.out.println("O quociente é : " + quociente);
        System.out.println("O resto da divisão é : " + resto);

    }
}
