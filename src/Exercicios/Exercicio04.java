package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que receba um número inteiro e
// imprima na tela o seu antecessor e o seu sucessor.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = dados.nextInt();
        int antecessor = num - 1;
        int sucessor = num + 1;
        System.out.println("Número antecessor do " + num + " é : " + antecessor);
        System.out.println("Número sucessor do " + num + " é : " + sucessor);
    }
}
