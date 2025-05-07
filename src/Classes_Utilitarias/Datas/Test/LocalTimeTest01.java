package Classes_Utilitarias.Datas.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32,12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);//retorna o horario
        System.out.println(timeNow);//retorna o horario
        System.out.println(time.getHour());//retorna somente a hora
        System.out.println(time.getMinute());//retorna somente o minuto
        System.out.println(time.getSecond());//retorna somente o segundos
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));//representa o campo de hora no formato de 1 a 12, como em um relógio de 12 horas.
        System.out.println(LocalTime.MIN);//retorna o horario minimo
        System.out.println(LocalTime.MAX);//retorna o horario Maximo
    }
}
