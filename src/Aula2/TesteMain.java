package Aula2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TesteMain {
    public static void main(String[] args) {
        System.out.println("Exercício 1:");
        Vacina leo = new Vacina(LocalDate.of(2023, 2, 1));

        leo.datasDasPróximasVacinas();

        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");

        System.out.println();

        System.out.println("Exercício 2:");

        for(String d : datasStrings){
            LocalDate dts = LocalDate.parse(d);
            System.out.println(dts);
        }
        System.out.println();
        System.out.println("Exercício 3:");
        List<LocalDate> datas = new ArrayList<>();
        datas.add(LocalDate.of(2023, 8, 10));
        datas.add(LocalDate.of(2022, 5, 20));
        datas.add(LocalDate.of(2021, 11, 30));

        for(LocalDate d: datas){
            System.out.println(d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }

        System.out.println();
        System.out.println("Exercício 4:");
        ZonedDateTime mundo = ZonedDateTime.now();



    }
}
