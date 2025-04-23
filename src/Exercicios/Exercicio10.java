package Exercicios;

import java.util.Scanner;

    //Faça um algoritmo que leia três notas obtidas por um aluno,
// e imprima na tela a média das notas.
    public class Exercicio10 {
        public static void main(String[] args) {
            Scanner dados = new Scanner(System.in);
            System.out.println("Primeira nota: ");
            double nota1 = dados.nextDouble();
            System.out.println("Segunda nota: ");
            double nota2 = dados.nextDouble();
            System.out.println("Terceira nota: ");
            double nota3 = dados.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A media é " + media);
        }
    }
