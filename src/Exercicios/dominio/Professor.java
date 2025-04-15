package Exercicios.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(){

    }

    public Professor(String nome, String especialidade){
       this.nome = nome;
       this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void imprime(Seminario seminario, Aluno aluno, Local local, Professor professor){
        System.out.println();
        System.out.println("-- Aluno --");
        System.out.println("Nome: "+ aluno.getNome());
        System.out.println("Idade: "+ aluno.getIdade() );
        System.out.println();

        System.out.println(" -- Seminário --");
        System.out.println("Titúlo: "+ seminario.getTitulo());
        System.out.println();

        System.out.println("-- Local --");
        System.out.println("Local: "+ local.getEnedereco());
        System.out.println();

        System.out.println(" -- Professor --");
        System.out.println(professor.getNome());
        System.out.println(professor.getEspecialidade());
    }
}
