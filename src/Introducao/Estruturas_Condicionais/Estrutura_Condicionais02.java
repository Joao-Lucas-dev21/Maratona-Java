package Introducao.Estruturas_Condicionais;

public class Estrutura_Condicionais02 {
    public static void main(String[] args) {
        int idade = 18;
        String categoria = "";

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
        System.out.println(categoria);
    }
}
