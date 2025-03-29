package Exercicios;

public class Exercicio13 {
    public static void main(String[] args) {
        //Crie um programa que conte quantas vezes um número aparece dentro de um array.

        int[] lista = {3, 5, 3, 2, 3, 7, 8, 3};
        int numeroprocurado = 3;
        int vezes = 0;

        for (int i = 0; i < lista.length; i++) {
            if (numeroprocurado == lista[i]) {
                vezes += 1;
            }
        }
        System.out.println("O número " + numeroprocurado + " aparece " + vezes + " no array");
    }
}