package Exercicios.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    },
    PIX{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.15;
        }
    };

    public abstract double calcularDesconto(double valor);
}
