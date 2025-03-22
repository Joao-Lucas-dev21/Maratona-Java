package Exercicios;

public class Exercicio05 {
    public static void main(String[] args) {
        //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor
        // do salário de um usuário, calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado.
        // (Base para o Salário mínimo R$ 1.293,20).

        double salarioMinimo = 1293.20;
        double salarioUsuario = 6000.80;
        double usuarioGanha = salarioUsuario / salarioMinimo;
        System.out.printf("O usuário ganha %.2f salário(s) minímo(s)!", usuarioGanha);
    }
}
