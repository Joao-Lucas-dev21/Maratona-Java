package Orientacao_Objetoss.Associacao.test;

import Orientacao_Objetoss.Associacao.dominio.Aluno;
import Orientacao_Objetoss.Associacao.dominio.Local;
import Orientacao_Objetoss.Associacao.dominio.Professoor;
import Orientacao_Objetoss.Associacao.dominio.Seminarios;

public class SistemaGerenciador {
    public static void main(String[] args) {
        Seminarios seminario1 = new Seminarios("Vivendo de TI");
        Seminarios seminario2 = new Seminarios("Como conseguir vaga de Estágio");
        Seminarios[] seminarios = {seminario1, seminario2};
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Damaris", 21);
        Professoor professor1 = new Professoor("Willam", "Programação");
        Local local1 = new Local("Toledo");
        Local local2 = new Local("Sesi");



    }
}
