package Orientacao_Objetoss.Interfaces.test;

import Orientacao_Objetoss.Interfaces.dominio.DataLoader;
import Orientacao_Objetoss.Interfaces.dominio.DatabaseLoader;
import Orientacao_Objetoss.Interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMamDataSize();
        DatabaseLoader.retriveMamDataSize();
    }
}
