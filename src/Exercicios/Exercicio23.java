package Exercicios;

import java.util.Scanner;

//Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e
// percentual de desconto do INSS. Imprima na tela o salário líquido final.
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Valor da hora aula: ");
        double valorHora = dados.nextDouble();
        System.out.println("Número de aulas selecionadas no mês");
        int numerosAulas = dados.nextInt();
        System.out.println("Percentual de desconto do INSS");
        double descontoInss = dados.nextDouble();

        double salarioBruto = valorHora * numerosAulas;
        double desconto = (salarioBruto * descontoInss) / 100;
        System.out.println("Desconto: " + desconto);
        double valorFinal = salarioBruto - desconto;
        System.out.println("Salário líquido final é : " + valorFinal);

    }
}
