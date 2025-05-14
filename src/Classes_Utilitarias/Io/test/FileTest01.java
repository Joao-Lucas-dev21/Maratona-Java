package Classes_Utilitarias.Io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Criado " + isCreated);
            System.out.println("Caminho " + file.getPath());
            System.out.println("Caminho absoluto " +file.getAbsolutePath());
            System.out.println("Saber se é diretório " +file.isDirectory());
            System.out.println("Saber se é arquivo " +file.isFile());
            System.out.println("Saber se é arquivo oculto " +file.isHidden());
            System.out.println("Saber se pode ler " +file.canRead());
            System.out.println("Quando foi modificado " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deletado " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
