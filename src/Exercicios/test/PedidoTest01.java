package Exercicios.test;

import Exercicios.dominio.Pedido;
import Exercicios.dominio.TipoCliente;
import Exercicios.dominio.TipoPagamento;

public class PedidoTest01 {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("João", TipoCliente.PESSOA_FISICA, TipoPagamento.PIX, 250);
        Pedido pedido2 = new Pedido("Damaris", TipoCliente.VIP, TipoPagamento.DEBITO, 1000);
        Pedido pedido3 = new Pedido("Keiti", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO, 120);
        pedido1.imprime();
        pedido2.imprime();
        pedido3.imprime();
    }
}
