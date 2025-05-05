package Classes_Utilitarias.Strings;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse(); // ymedacA ojoDveD enauS mailliW
        sb.reverse(); // William Suane DevDojo Academy
        sb.delete(0,3); // liam Suane DevDojo Academy
        System.out.println(sb);
    }
}
