package Orientacao_Objetoss.Polimorfismo.Test;

import Orientacao_Objetoss.Polimorfismo.Serviço.RepositorioArquivo;
import Orientacao_Objetoss.Polimorfismo.Serviço.Repositorio_Banco_Dados;
import Orientacao_Objetoss.Polimorfismo.repositorio.Repositorio;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
