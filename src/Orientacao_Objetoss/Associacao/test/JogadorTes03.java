package Orientacao_Objetoss.Associacao.test;

import Orientacao_Objetoss.Associacao.dominio.Jogador;
import Orientacao_Objetoss.Associacao.dominio.Time;

public class JogadorTes03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);
        System.out.println("=== Jogador ===");
        jogador.imprime();

        System.out.println("=== Time ===");
        time.imprime();
    }
}
