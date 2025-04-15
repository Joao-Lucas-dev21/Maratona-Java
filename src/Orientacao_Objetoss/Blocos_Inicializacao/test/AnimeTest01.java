package Orientacao_Objetoss.Blocos_Inicializacao.test;

import Orientacao_Objetoss.Blocos_Inicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");

        }

    }
}
