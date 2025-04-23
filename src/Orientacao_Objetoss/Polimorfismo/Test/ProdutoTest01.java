package Orientacao_Objetoss.Polimorfismo.Test;

import Orientacao_Objetoss.Polimorfismo.Serviço.CalcularImposto;
import Orientacao_Objetoss.Polimorfismo.dominio.Computador;
import Orientacao_Objetoss.Polimorfismo.dominio.Televisao;
import Orientacao_Objetoss.Polimorfismo.dominio.Tomate;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja",10);
        Televisao tv = new Televisao("LG 50\" ", 5000);
        CalcularImposto.calcularImposto(computador);
        System.out.println("--------------------");
        CalcularImposto.calcularImposto(tomate);
        System.out.println("--------------------");
        CalcularImposto.calcularImposto(tv);
    }
}
