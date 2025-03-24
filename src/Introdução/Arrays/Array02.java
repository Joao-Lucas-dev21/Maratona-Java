package Introdução.Arrays;

public class Array02 {
    public static void main(String[] args){
        // byte, short, int, long, float e double 0
        //char "/u0000" ' '
        //boolean false
        //String null

        String [] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Damaris";
        nomes[2] = "Keiti";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
