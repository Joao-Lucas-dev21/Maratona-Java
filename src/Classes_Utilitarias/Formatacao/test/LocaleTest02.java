package Classes_Utilitarias.Formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());//Retorna como esta configurado o pc
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        //Mostra todas as linguas supotadas
        for (String isoCountrie : isoCountries) {
            System.out.print(isoCountrie +" " );
        }
        System.out.println();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }


    }
}
