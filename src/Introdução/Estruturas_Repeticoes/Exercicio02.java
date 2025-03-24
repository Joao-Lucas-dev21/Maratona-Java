package Introdução.Estruturas_Repeticoes;

public class Exercicio02 {
    public static void main(String[] args) {
        double carro = 30000;
        for (int parcela = 1; parcela <= carro; parcela++) {
            double valorParcela = carro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela +" R$"+valorParcela);
        }
    }
}
