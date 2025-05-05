package Classes_Utilitarias.Datas.Test;

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

        Calendar calendar = Calendar.getInstance();
        DateFormat dft1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dft2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dft3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dft4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dft5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia "+ dft1.format(calendar.getTime()));
        System.out.println("Suiça "+ dft2.format(calendar.getTime()));
        System.out.println("India "+ dft3.format(calendar.getTime()));
        System.out.println("Japão "+ dft4.format(calendar.getTime()));
        System.out.println("Holanda "+ dft5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeCH.getDisplayCountry(localeJapao));

    }
}
