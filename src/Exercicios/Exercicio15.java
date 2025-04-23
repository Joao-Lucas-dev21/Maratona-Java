package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e
// dias essa pessoa ja viveu.
//Leve em consideração o ano com 365 dias e o mês com 30 dias.
//(Ex: 5 anos, 2 meses e 15 dias de vida)
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Ano que você nasceu: ");
        int anoNascimento = dados.nextInt();
        int anoAtual = 2025;
        int anos = anoAtual - anoNascimento;
        int meses = 12 / anos;
        int dias = 30 * meses;
        System.out.println(anos + "anos, " + meses + " meses e " + dias + "dias");

    }
}
