package Classes_Utilitarias.Datas.Test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();//05/05/2025 14:55
        df[1] = DateFormat.getDateInstance();//5 de mai. de 2025
        df[2] = DateFormat.getDateTimeInstance();//5 de mai. de 2025 14:53:50
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);//05/05/2025
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);//5 de mai. de 2025
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);//5 de maio de 2025
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);//segunda-feira, 5 de maio de 2025

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime())); //Esse metodo pega o objeto Date retornado
            // por calendar.getTime() e o formata como uma String, de acordo com o estilo do DateFormat atual da
            // iteração.
        }

    }
}
