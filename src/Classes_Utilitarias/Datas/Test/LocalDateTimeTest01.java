package Classes_Utilitarias.Datas.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");//É possivel passar por String
        LocalTime time = LocalTime.parse("23:45:00");//É possivel passar por String
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ltd1 = date.atTime(time);//Tem a data e adiciona a gora
        LocalDateTime ltd2 = time.atDate(date);//Tem a hora e adiciona a data
        System.out.println(ltd1);
        System.out.println(ltd2);
    }
}
