package Classes_Utilitarias.Strings;

public class String02 {
    public static void main(String[] args) {
        String nome = "luffy";
        String numeros = "012345";

        System.out.println(nome.charAt(0));//Retorna o valor do indice, caso não exista valor no indece ocorrerá um erro

        System.out.println(nome.length());//Para saber o tamanho da String

        System.out.println(nome.replace("f", "l"));// Troca todos os caracteres da primeira posição pelo caracter que desejar

        System.out.println(nome.toLowerCase());//Deixa toda a String com letra minúscula

        System.out.println(nome.toUpperCase());//Deixa toda a String com letra maiúscula

        System.out.println(numeros.length());//Retorna o tamanho

        System.out.println(numeros.substring(3, numeros.length())); //Recebe o indice da onde quer começar e o indice que quer terminar -1, ja com length pega todos

        System.out.println(nome.trim());//Remove os valores em branco do começo e do fim da String
    }
}
