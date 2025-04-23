package Exercicios;

import java.awt.*;
import java.util.Scanner;

//Faça um algoritmo que leia o valor do salário mínimo e o
// valor do salário de um usuário, calcule quantos salários mínimos
// esse usuário ganha e imprima na tela o resultado.
// (Base para o Salário mínimo R$ 1.293,20).
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = dados.nextDouble();
        System.out.println("Qual o valor do salário minímo: ");
        double salarioMinimo = dados.nextDouble();
        double calculoSalario = salario / salarioMinimo;
        int valor = (int) calculoSalario;
        System.out.printf("Você ganha "+valor +" salários mínimos");
    }
}
