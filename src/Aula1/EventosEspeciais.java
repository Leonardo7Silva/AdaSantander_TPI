package Aula1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EventosEspeciais {

    static LocalDate namoro(){
      return LocalDate.of(2013,06,28);
    }

    static LocalTime buscarBianca(){
        return LocalTime.of(11,40, 00);
    }

    static LocalDateTime nascimentoBianca(){
        return LocalDateTime.of(2023 ,12, 21, 4, 30, 00);
    }

}
