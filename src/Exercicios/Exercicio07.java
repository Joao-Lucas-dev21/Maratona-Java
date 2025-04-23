package Exercicios;

import java.util.Scanner;
//Faça um algoritmo que leia dois valores booleanos (lógicos)
// e determine se ambos são VERDADEIRO ou FALSO.

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite true ou false: ");
        boolean valor1 = dados.nextBoolean();
        System.out.println("Digite true ou false mais uma vez: ");
        boolean valor2 = dados.nextBoolean();

        if (valor1 != valor2){
            System.out.println("Valores diferentes");
        } else{
            System.out.println("Valores iguais");
        }
    }
}
