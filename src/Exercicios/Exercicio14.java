package Exercicios;

public class Exercicio14 {
    public static void main(String[] args) {
        //Crie um programa que verifique se um array está ordenado em ordem crescente.
        int[] lista = {1, 3, 2, 4, 5};
        boolean verifica = true;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > lista[i + 1]) {
                verifica = false;
                break;
            }
        }
        if (verifica){
            System.out.println("O array está em ordem crescente.");
        } else{
            System.out.println("O array NÃO está em ordem crescente.");
        }
    }
}