package Orientacao_Objetoss.Polimorfismo.Serviço;

import Orientacao_Objetoss.Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}

