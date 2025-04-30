package Orientacao_Objetoss.Exception.execpition.test;

import Orientacao_Objetoss.Exception.execpition.dominio.Funcionario;
import Orientacao_Objetoss.Exception.execpition.dominio.LoginInvalidoException;
import Orientacao_Objetoss.Exception.execpition.dominio.Pessoa;

public class SobrescritaComExecptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
}
