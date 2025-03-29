package Introducao.Estruturas_Condicionais;

public class Estruturas_Condicionais03 {
    public static void main(String[] args) {
        // (condição) ? verdadeiro : falso;
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro joão";
        String mensagemNaodoar = "Ainda não tenho condições";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaodoar;

        System.out.println(resultado);
    }
}
