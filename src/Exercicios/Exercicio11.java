package Exercicios;

public class Exercicio11 {
    public static void main(String[] args) {
        //Crie um programa que percorra um array de inteiros e calcule
        // a soma dos números pares e a soma dos números ímpares separadamente.

        int [] lista = {1,2,3,4,5,6,7,8,9};
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 ==0){
                somaPares += lista[i];
            } else {
                somaImpares += lista[i];
            }
        }
        System.out.println("A soma dos numeros pares é : "+ somaPares);
        System.out.println("A soma dos numeros ímpares é : "+ somaImpares);
    }
}