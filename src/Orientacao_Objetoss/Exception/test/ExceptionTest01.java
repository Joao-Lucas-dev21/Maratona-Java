package Orientacao_Objetoss.Exception.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionTest01 {
    // Cria um logger para a classe
    private static final Logger logger = Logger.getLogger(ExceptionTest01.class.getName());
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
        boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e){
            // Registrar o erro no log
            logger.log(Level.SEVERE, "Erro ao criar o arquivo", e);
        }
    }
}
