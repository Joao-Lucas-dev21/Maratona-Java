package Orientacao_Objetoss.Polimorfismo.Serviço;

import Orientacao_Objetoss.Polimorfismo.repositorio.Repositorio;

public class Repositorio_Banco_Dados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}

