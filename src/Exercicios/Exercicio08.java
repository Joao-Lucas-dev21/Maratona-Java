package Exercicios;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

//Faça um algoritmo que leia três valores inteiros diferentes e
// imprima na tela os valores em ordem decrescente.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = dados.nextInt();
        System.out.println("Digite mais um valor: ");
        int valor2 = dados.nextInt();
        System.out.println("Digite outro valor: ");
        int valor3 = dados.nextInt();
        Integer[] valores = new Integer[]{valor1, valor2, valor3};
        Arrays.sort(valores, Collections.reverseOrder());

        for (int num : valores) {
            System.out.println(num);
        }
    }
}

