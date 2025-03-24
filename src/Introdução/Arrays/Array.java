package Introdução.Arrays;

public class Array {
    public static void main(String[] args){
        /*
         Formas de iniciar um array:
         int[] numeros1 = new int[3];
         int[] numeros2 = {1,2,3,4,5};
         int[] numeros3 = new int [] {1,2,3,4,5};
        */

        int [] idade = new int[3];
        idade[0] = 15;
        idade[1] = 20;
        idade[2] = 25;
        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);
    }
}
