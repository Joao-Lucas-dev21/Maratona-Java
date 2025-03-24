package Introdução.Estruturas_Repeticoes;

public class Exercicio03 {
    public static void main(String[] args) {
        double carro = 30000;
        for (int parcela = (int) carro; parcela >= 1; parcela--) {
            double valorParcela = carro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+ parcela +" R$"+valorParcela);
        }
    }
}
