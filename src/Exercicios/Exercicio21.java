package Exercicios;

import java.util.Random;

//Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
public class Exercicio21 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(100);

        System.out.println("Valor aleatório entre 0 e 100.");
        System.out.println(numeroAleatorio);

    }
}
