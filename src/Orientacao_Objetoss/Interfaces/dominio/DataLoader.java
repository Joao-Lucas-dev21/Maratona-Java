package Orientacao_Objetoss.Interfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    static void retriveMamDataSize(){
        System.out.println("Dentro do retriveMaxDataSize em interface");
    }
}
