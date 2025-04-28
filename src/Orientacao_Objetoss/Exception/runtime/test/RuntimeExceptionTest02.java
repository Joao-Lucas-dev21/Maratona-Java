package Orientacao_Objetoss.Exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
    }

    /**
     * @param a
     * @param b não pode ser 0
     * @throws IllegalArgumentException caso b seja 0
     */

    private static int divisao(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException(("Argumento ilegal, não pode ser 0"));
        }
        return a/b;
    }
}
