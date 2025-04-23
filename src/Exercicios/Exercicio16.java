package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que leia três valores que representam os três lados de um triângulo
// e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Defina 3 valores para represetar um triângulo:");
        System.out.println("Valor 1: ");
        double valor1 = dados.nextDouble();
        System.out.println("Valor 2: ");
        double valor2 = dados.nextDouble();
        System.out.println("Valor 3: ");
        double valor3 = dados.nextDouble();

        if (valor1 + valor2 > valor3 && valor2 + valor3 > valor1 && valor1 + valor3 > valor2) {
            System.out.println("É um triângulo");
            if (valor1 == valor2 && valor1 == valor3){
                System.out.println("Equilátero");
            } else if (valor1 != valor2 && valor1 == valor3 || valor1 == valor2 && valor1 != valor3 || valor2 != valor3 && valor2 == valor1) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }




    }
}