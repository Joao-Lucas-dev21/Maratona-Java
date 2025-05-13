package Classes_Utilitarias.Datas.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);//Você atribui uma data
        LocalDate agora = LocalDate.now();//Pega a data atual
        agora = agora.plusWeeks(4);
        System.out.println(date.getYear());//retorna o ano
        System.out.println(date.getMonth());//retorna o mês
        System.out.println(date.getMonthValue());//retorna o valor do mês
        System.out.println(date.getDayOfWeek());// retorna o dia da semana
        System.out.println(date.getDayOfMonth());//retorna o dia do mês
        System.out.println(date.lengthOfMonth());//retorna quanto dias há no mês
        System.out.println(date.isLeapYear());//Retorna se o ano é bissexto ou não
        System.out.println(date.get(ChronoField.YEAR));//Pega o ano
        System.out.println(date.get(ChronoField.MONTH_OF_YEAR));//Pega o valor do mês
        System.out.println(date);//retorna a data
    }
}
