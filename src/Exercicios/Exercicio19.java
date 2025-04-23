package Exercicios;

//Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
public class Exercicio19 {
    public static void main(String[] args) {
        int num = 1;
        while (num < 11){
            for (int i = 0; i <= 10 ; i++) {
                int result = num * i;
                System.out.println(num + "x" + i + "=" + result);
            }
            num++;
            System.out.println("--------------");
        }

    }
}
