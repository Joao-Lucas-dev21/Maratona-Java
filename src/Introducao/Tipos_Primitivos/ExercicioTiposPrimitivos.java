package Introducao.Tipos_Primitivos;
/*
Prática
Crie varíaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>.
 */

public class ExercicioTiposPrimitivos {
    public static void main(String[] args) {
    String nome = "João";
    String endereco = "Rua tal tal";
    double salario = 1800.20;
    String data = "10/03/2025";

        System.out.println("Eu " +nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data);
    }
}
