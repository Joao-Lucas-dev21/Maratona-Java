package Orientacao_Objetoss.Metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double num : salario) {
            System.out.println("Salario > " + num);
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if (salario == null) {
            return;
        }
        double media = 0;
        for (double num : salario) {
            media += num;
        }
        media /= salario.length;
        System.out.println("A média dos salarios é: " + media);
    }
}
