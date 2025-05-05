package Classes_Utilitarias.Datas.Test;

import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        // A maioria dos metódos ja estão depreciados da classe Date
        Date date = new Date(1746465670790L); // Trabalha com ms e é um Long 1000000000
        System.out.println(date);
    }
}
