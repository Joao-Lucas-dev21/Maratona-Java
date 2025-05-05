package Classes_Utilitarias.Datas.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));// Dia da Semana
        System.out.println(c.get(Calendar.DAY_OF_MONTH));// Dia do mês
        System.out.println(c.get(Calendar.DAY_OF_YEAR));//Dias do ano
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//Dia da semana no ano

        c.add(Calendar.DAY_OF_MONTH, 0);// Adiciona dia do mês
        c.add(Calendar.HOUR, 12);// Adicionar horas
        c.roll(Calendar.HOUR, 12);// Este metodo não deixa passar o dia
        Date date = c.getTime();
        System.out.println(date);


    }
}
