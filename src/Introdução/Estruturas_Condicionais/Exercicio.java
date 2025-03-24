package Introdução.Estruturas_Condicionais;

public class Exercicio {
    public static void main(String[] args) {
        double salario = 70000;
        double primeiraFaixa = 9.70 % 100;
        double segundaFaixa = 37.35 % 100;
        double terceiraFaixa = 49.50 % 100;
        double valorImposto;

        if (salario <= 34712){
            valorImposto = salario * primeiraFaixa;
            System.out.println("Você terá que pagar: "+ valorImposto);
        } else if (salario >= 34713 && salario <= 68507){
            valorImposto = salario * segundaFaixa;
            System.out.print("Você terá que pagar "+ valorImposto);
        } else{
            valorImposto = salario * terceiraFaixa;
            System.out.print("Você terá que pagar "+ valorImposto);
        }
    }
}
