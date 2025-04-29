package Orientacao_Objetoss.Exception.execpition.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
            // throw new RuntimeException("Problema na hora de criar o arquivo");
            // fazendo isto, não precisa não precisa fazer o tratamento de IoException, posso apagar a assinatura
        }
    }
}
