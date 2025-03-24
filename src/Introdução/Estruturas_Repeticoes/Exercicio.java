package Introdução.Estruturas_Repeticoes;

public class Exercicio {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

