package Exercicios.test;

import Exercicios.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.velocidade = 50;

        carro.acelerar(20);

        carro.exibirVelocidade();

        carro.frear(40);

        carro.exibirVelocidade();
    }
}
