package Introdução.Estruturas_Condicionais;

public class Exercicio_03 {
    public static void main(String[] args){
        // Suponha que você esteja desenvolvendo o sistema de um hotel
        // que deva exibir mensagens na recepção para diferentes ações
        // dos hospedes, são elas:
        // Fazer Check-in
        // Chamar serviço de quarto
        // Fazer pedido

        int recepcao = 3;

        switch (recepcao){
            case 1 :
                System.out.println("Fazer Check-in");
                break;
            case 2:
                System.out.println("Chamar serviço de quarto");
                break;
            case 3:
                System.out.println("Fazer pedido");
        }
    }
}
