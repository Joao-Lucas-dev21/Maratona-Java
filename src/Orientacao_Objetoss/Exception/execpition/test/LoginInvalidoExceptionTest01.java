package Orientacao_Objetoss.Exception.execpition.test;

import Orientacao_Objetoss.Exception.execpition.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Digite o usuário: ");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Digite a senha: ");
        String senhaDigitado = teclado.nextLine();
        if (!usernameDB.equals(userNameDigitado)){
            if (!senhaDB.equals(senhaDigitado)){
                throw new LoginInvalidoException("Usuário ou senha inválida");
            }
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
