package Exercicios.dominio;

public class Pedido {
    private String nomeCliente;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    private double valorTotal;

    public Pedido(String nomeCliente, TipoCliente tipoCliente, TipoPagamento tipoPagamento, double valorTotal) {
        this.nomeCliente = nomeCliente;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
    }

    public void imprime(){
        System.out.println("Cliente: "+this.nomeCliente);
        System.out.println("Tipo: "+ this.tipoCliente.getNomeRelatorio());
        System.out.println("Pagamento: "+ this.tipoPagamento);
        System.out.println("Valor Original: "+ this.valorTotal);
        System.out.println("Valor com Desconto: "+ calcularValorComDesconto(valorTotal));
        System.out.println("-------------------------");
    }

    public double calcularValorComDesconto(double valor){
        double desconto = tipoPagamento.calcularDesconto(valor);
        return valorTotal - desconto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
