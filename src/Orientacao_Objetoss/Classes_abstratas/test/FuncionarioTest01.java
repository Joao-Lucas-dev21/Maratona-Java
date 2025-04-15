package Orientacao_Objetoss.Classes_abstratas.test;

import Orientacao_Objetoss.Classes_abstratas.dominio.Desenvolvedor;
import Orientacao_Objetoss.Classes_abstratas.dominio.Funcionario;
import Orientacao_Objetoss.Classes_abstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya ", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
