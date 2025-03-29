package Orientacao_Objetoss.introducao.test;

import Orientacao_Objetoss.introducao.dominio.Carro;

public class Carrotest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Gol";
        carro.modelo = "G3";
        carro.ano = 2008;

        carro2.nome = "Fusion";
        carro2.modelo = "Sport";
        carro2.ano = 2014;

        System.out.println("Carro 1:");
        System.out.println("Nome: " + carro.nome + ", Modelo: " + carro.modelo + ", Ano: " + carro.ano);
        System.out.println("\nCarro 2:");
        System.out.println("Nome: " + carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: " + carro2.ano);
    }
}
