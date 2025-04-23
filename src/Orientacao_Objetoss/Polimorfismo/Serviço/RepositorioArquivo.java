package Orientacao_Objetoss.Polimorfismo.Serviço;

import Orientacao_Objetoss.Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo");
    }
}
