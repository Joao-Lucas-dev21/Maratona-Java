package Exercicios;

public class Exercicio09 {
    public static void main(String[] args) {
        //Crie um programa que encontre o maior e o menor número dentro de um array.

        int[] lista = {10, 5, 8, 3, 15, 2, 7};
        int valorMaior = lista[0];
        int valorMenor = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > valorMaior) {
                valorMaior = lista[i];
            }
            if (lista[i] < valorMenor){
                valorMenor = lista[i];
            }
        }
        System.out.println(valorMaior);
        System.out.println(valorMenor);
    }
}