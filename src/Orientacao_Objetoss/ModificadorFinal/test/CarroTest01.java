package Orientacao_Objetoss.ModificadorFinal.test;

import Orientacao_Objetoss.ModificadorFinal.dominio.Carro;
import Orientacao_Objetoss.ModificadorFinal.dominio.Comprador;
import Orientacao_Objetoss.ModificadorFinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Joao");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Goll");
        ferrari.imprime();
    }
}
