package Classes_Utilitarias.Wrappers;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'w';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'w';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeira = Boolean.parseBoolean("True");
        System.out.println(verdadeira);
        System.out.println("-----------");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
