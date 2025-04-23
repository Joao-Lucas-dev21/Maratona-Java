package Orientacao_Objetoss.Polimorfismo.dominio;

public class Tomate extends Produto{
    private String dataValidade;
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
