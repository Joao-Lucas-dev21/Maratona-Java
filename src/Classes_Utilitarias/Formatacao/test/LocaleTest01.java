package Classes_Utilitarias.Formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Locale localeEsp = new Locale("es", "ES");

        Calendar calendar = Calendar.getInstance();
        DateFormat dft1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dft2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dft3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dft4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dft5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat dft6 = DateFormat.getDateInstance(DateFormat.FULL, localeEsp);

        System.out.println("Italia "+ dft1.format(calendar.getTime()));
        System.out.println("Suiça "+ dft2.format(calendar.getTime()));
        System.out.println("India "+ dft3.format(calendar.getTime()));
        System.out.println("Japão "+ dft4.format(calendar.getTime()));
        System.out.println("Holanda "+ dft5.format(calendar.getTime()));
        System.out.println("Espanha "+ dft6.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());// Fala qual o pais que estamos pegando
        System.out.println(localeCH.getDisplayCountry(localeEsp));//Fala qual o pais que estamos pegando,
        // mas na lingua do pais passado em parâmetro

    }
}
