package Orientacao_Objetoss.Enumeracoes.test;

import Orientacao_Objetoss.Enumeracoes.dominio.Cliente;

import Orientacao_Objetoss.Enumeracoes.dominio.TipoCliente;
import Orientacao_Objetoss.Enumeracoes.dominio.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joao", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Clebin", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Damaris", TipoCliente.PESSOA_JURIDICA, TipoPagamento.PIX);
        Cliente cliente3 = new Cliente("Gov", TipoCliente.GOVERNO, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.PIX.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);


        System.out.println("===================");
        TipoCliente tipoGoverno = TipoCliente.tipoClientePorNomeRelatorio(("Governo"));
        System.out.println(tipoGoverno);
    }
}
