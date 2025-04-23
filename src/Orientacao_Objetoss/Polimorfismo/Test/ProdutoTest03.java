package Orientacao_Objetoss.Polimorfismo.Test;

import Orientacao_Objetoss.Polimorfismo.Serviço.CalcularImposto;
import Orientacao_Objetoss.Polimorfismo.dominio.Computador;
import Orientacao_Objetoss.Polimorfismo.dominio.Produto;
import Orientacao_Objetoss.Polimorfismo.dominio.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzem 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/04/2025");

        CalcularImposto.calcularImposto(tomate);
        System.out.println("-----------");
        CalcularImposto.calcularImposto(produto);
    }
}
