package Orientacao_Objetoss.Exception.execpition.test;

import Orientacao_Objetoss.Exception.execpition.dominio.Leitor1;
import Orientacao_Objetoss.Exception.execpition.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try(Leitor1 leito1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {
        } catch (IOException e){
        }
    }


    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException exception){
                exception.printStackTrace();
            }
        }

    }
}
