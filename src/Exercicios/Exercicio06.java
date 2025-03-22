package Exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        //6 - Faça um algoritmo que leia um valor qualquer e
        // imprima na tela com um reajuste de 15%.

        double valor = 230;
        double reajuste = valor + (valor * 15 / 100);
        System.out.println(reajuste);
    }
}
