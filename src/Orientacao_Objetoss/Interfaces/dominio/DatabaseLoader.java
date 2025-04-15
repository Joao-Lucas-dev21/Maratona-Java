package Orientacao_Objetoss.Interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retriveMamDataSize(){
        System.out.println("Dentro do retriveMaxDataSize em DataBaseLoader");
    }

}
