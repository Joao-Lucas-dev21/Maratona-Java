package Orientacao_Objetoss.Polimorfismo.Serviço;

import Orientacao_Objetoss.Polimorfismo.dominio.Computador;
import Orientacao_Objetoss.Polimorfismo.dominio.Produto;
import Orientacao_Objetoss.Polimorfismo.dominio.Tomate;

public class CalcularImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório do imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
