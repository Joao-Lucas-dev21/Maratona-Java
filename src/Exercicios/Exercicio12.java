package Exercicios;

public class Exercicio12 {
    public static void main(String[] args) {
        //Crie um programa que verifique se um número digitado pelo usuário
        // está dentro de um array e informe sua posição.

        int[] lista = {1,2,5,4,5,6,7,8};
        int num = 5;
        boolean encontrado = false;

        for (int i = 0; i < lista.length; i++) {
            if (num == lista[i]){
                System.out.println("Está dentro do array na posição: "+ i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("O número " + num + " não foi encontrado no array.");
        }

    }
}