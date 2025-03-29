package Exercicios.dominio;

public class Carro {
    public int velocidade;

    public void acelerar(int num){
        velocidade += num;
    }

    public void frear(int num){
        velocidade -= num;
    }

    public void exibirVelocidade(){
        System.out.println(velocidade);
    }
}


