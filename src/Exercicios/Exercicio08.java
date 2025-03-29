package Exercicios;

public class Exercicio08 {
    public static void main(String[] args) {
        //Crie um programa que some todos os elementos de um array de inteiros.
        int [] lista = {1,2,3,4,5,6};
        int soma = 0;

        for (int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }
        System.out.println(soma);
    }
}
