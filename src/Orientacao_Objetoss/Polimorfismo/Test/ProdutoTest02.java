package Orientacao_Objetoss.Polimorfismo.Test;

import Orientacao_Objetoss.Polimorfismo.dominio.Computador;
import Orientacao_Objetoss.Polimorfismo.dominio.Produto;
import Orientacao_Objetoss.Polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzem 9", 3000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println("---------------");
        Produto produto2 = new Tomate("Tomate Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
