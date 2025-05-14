package Classes_Utilitarias.Scanner.teste;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        String[] nomes = texto.split(", "); //Delimitadores
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
