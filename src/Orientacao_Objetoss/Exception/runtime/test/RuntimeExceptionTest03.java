package Orientacao_Objetoss.Exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        String resutado = abreConexao();
        System.out.println(resutado);
    }

    private static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivos");
            return "Conexão aberta";
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    public static void abreConexao2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivos");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}


