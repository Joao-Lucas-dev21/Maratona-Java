package Exercicios;
//Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
// sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será
// gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros
// utilizados para fazer a viagem.

import java.util.Scanner;

//Fórmula: distância = tempo x velocidade.
// litros usados = distância / 12.

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("tempo que será gasto na viagem: ");
        int tempo = dados.nextInt();
        System.out.println("Velocidade média na viagem: ");
        int velocidade = dados.nextInt();

        int distancia = tempo * velocidade;
        int litros = distancia / 12;

        System.out.println("A distância percorrida foi : "+ distancia);
        System.out.println("Você gastou "+ litros +" litros de gasolina");



    }
}
