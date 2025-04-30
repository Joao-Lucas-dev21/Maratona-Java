package Classes_Utilitárias.Strings;

public class String01 {
    public static void main(String[] args) {
        String nome = "João"; // String constant pool
        String nome2 = "João";
        nome = nome.concat(" Lucas");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String ("João"); // 1 variavel de referência, 2 objeto do tipo String, 3 uma string no pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
