package Exercicios;
//Faça um algoritmo que leia o valor de um produto e determine o valor
// que deve ser pago, conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago.
// Utilize os códigos da tabela de condições de pagamento para
// efetuar o cálculo adequado.

import java.util.Scanner;

// Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Qual valor a ser pago:");
        double valor = dados.nextDouble();
        System.out.println("Qual a forma de pagamento 1- Dinheiro ou pix, 2- Cartão Crédito, 3- Parcelado em duas vezes, 4- Parcelado em três vezes ou mais.:");
        int formaPagamento = dados.nextInt();
        if (formaPagamento > 4){
            System.out.println("Opção invalida.");
            System.out.println("Qual a forma de pagamento 1- Dinheiro ou pix, 2- Cartão Crédito, 3- Parcelado em duas vezes, 4- Parcelado em três vezes ou mais.:");
            formaPagamento = dados.nextInt();
        }
        double desconto;
        if (formaPagamento == 1) {
            desconto = valor - (valor * 15 / 100);
            System.out.println("Pagamento por dinheiro ou cartão, recebe 15% de desconto.");
            System.out.println("Valor final: " + desconto);
        } else if (formaPagamento == 2) {
            desconto = valor - (valor * 10 / 100);
            System.out.println("Pagamento À Vista no cartão de crédito, recebe 10% de desconto.");
            System.out.println("Valor final: " + desconto);
        } else if (formaPagamento == 3) {
            System.out.println("Pagamento Parcelado no cartão em duas vezes, preço normal do produto sem juros.");
            System.out.println("Valor final: " + valor);
        } else {
            double juros = valor + (valor * 10 / 100);
            System.out.println("Pagamento Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%.");
            System.out.println("Valor final: " + juros);
        }
    }
}
