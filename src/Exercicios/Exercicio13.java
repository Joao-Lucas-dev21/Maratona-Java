package Exercicios;

import java.util.Scanner;

//Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e
// se ela é maior ou menor de idade.
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = dados.nextInt();
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
    }
}
