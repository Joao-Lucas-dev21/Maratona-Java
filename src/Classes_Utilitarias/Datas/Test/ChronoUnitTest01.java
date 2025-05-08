package Classes_Utilitarias.Datas.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2004, Month.DECEMBER, 16,12,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));//Anos
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));//Meses
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));//Semanas
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));//Dias

    }
}
