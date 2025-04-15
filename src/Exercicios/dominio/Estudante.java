package Exercicios.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calcularMedia(){
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media /= notas.length;
        System.out.printf("A média do(a) %s (%d anos) é: %.2f%n%n", this.nome, this.idade, media);
        verificarAprovacao(media);
    }

    public void verificarAprovacao(double media){
        if (media >= 7){
            System.out.println("Parábens, APROVADO!!");
            System.out.println("----------------");
        } else {
            System.out.println("----------------");
            System.out.println("REPROVADO!!");
        }
    }

}
