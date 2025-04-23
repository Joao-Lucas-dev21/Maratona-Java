package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que leia quatro notas obtidas por um aluno,
// calcule a média das nota obtidas, imprima na tela o nome do aluno e
// se o aluno foi aprovado ou reprovado.
// Para o aluno ser considerado aprovado sua média final deve ser
// maior ou igual a 7.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        String nome = dados.nextLine();
        System.out.println("Primeira nota: ");
        double nota1 = dados.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = dados.nextDouble();
        System.out.println("Terceira nota: ");
        double nota3 = dados.nextDouble();
        System.out.println("Quarta nota: ");
        double nota4 = dados.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println(nome + ", APROVADO sua média foi " + media);
        } else {
            System.out.println(nome + ", REPROVADO sua média foi " + media);
        }
    }
}
