package Classes_Utilitarias.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços e branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-z A-Z, digitos, _, e menos os caracters especiais
        // \W = tudo o que não for incluso no \w

        String regex = "\\d";
        String texto = "abaaba";
        String texto2 = "aba3bab4a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+ texto2 );
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }
    }
}
