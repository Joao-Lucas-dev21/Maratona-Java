package Orientacao_Objetoss.Sobrecarga_Metodos.test;

import Orientacao_Objetoss.Sobrecarga_Metodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
        anime.imprime();
    }


}
