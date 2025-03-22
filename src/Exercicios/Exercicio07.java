package Exercicios;

public class Exercicio07 {
    public static void main(String[] args) {
        //7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
        // e determine se ambos são VERDADEIRO ou FALSO.

        boolean valor1 = false;
        boolean valor2 = false;

        if (valor1 == true & valor2 == true){
            System.out.println("Ambos verdadeiro!");
        } else if (valor1 == false & valor2 == false){
            System.out.println("Ambos falso!");
        } else {
            System.out.println("Valores diferentes!");
        }
    }
}
