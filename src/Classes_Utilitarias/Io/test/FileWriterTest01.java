package Classes_Utilitarias.Io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        //Para agregar mais conteúdo, e não atualizar tudo o arquivo basta adicioar file, true
        try(FileWriter fw = new FileWriter(file);) {
            fw.write("Escrevendo no arquivo\nEscrevendo na outra linha\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
