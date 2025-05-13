package Classes_Utilitarias.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest05 {
    public static void main(String[] args) {
        // \d  → Qualquer dígito (0 a 9)
        // \D  → Qualquer caractere que NÃO seja dígito
        // \s  → Qualquer espaço em branco (espaço, \t tab, \n nova linha, \r retorno de carro, etc.)
        // \S  → Qualquer caractere que NÃO seja espaço em branco
        // \w  → Letras (a-z, A-Z), dígitos (0-9) e underscore (_) — não inclui acentos nem símbolos
        // \W  → Qualquer caractere que NÃO esteja em \w (ou seja, símbolos, acentos, etc.)

        // [ ] → Define um conjunto ou intervalo de caracteres. Ex: [aeiou], [0-9], [A-Za-z]
        // ?   → Casa com zero ou uma ocorrência do elemento anterior
        // *   → Casa com zero ou mais ocorrências
        // +   → Casa com uma ou mais ocorrências
        // {n,m} → Casa com no mínimo n e no máximo m ocorrências do elemento anterior

        // ( ) → Agrupa expressões ou captura partes da string
        // |   → Operador "OU". Ex: ovo|oco casa com "ovo" ou "oco"
        // ^   → Início da linha/string
        // $   → Fim da linha/string
        // .   → Qualquer caractere (exceto quebra de linha). Ex: 1.3 casa com 123, 1A3, 1@3, etc.

        //String regex = "[a-zA-C]";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "abaaba";
        String texto2 = "luffy@hotmail.com, 123jotaro@gmail.com. #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email válido: ");
        System.out.println("#@!zoro@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+ texto2 );
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }
        // int numeroHex = 0x59F9;
        //System.out.println(numeroHex);
    }
}
