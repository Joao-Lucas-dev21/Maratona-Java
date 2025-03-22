package Estruturas_Condicionais;

public class Exercicio_02 {
    public static void main(String[] args) {
        byte dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Domingo, Final de semana");
                break;
            case 2:
                System.out.println("Segunda, dia útil");
                break;
            case 3:
                System.out.println("Terça, dia útil");
                break;
            case 4:
                System.out.println("Quarta, dia útil");
                break;
            case 5:
                System.out.println("Quinta, dia útil");
                break;
            case 6:
                System.out.println("Sexta, dia útil");
                break;
            case 7:
                System.out.println("Sabado, Final de semana");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
