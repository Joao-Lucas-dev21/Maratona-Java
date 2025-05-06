package Classes_Utilitarias.Formatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormartTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
