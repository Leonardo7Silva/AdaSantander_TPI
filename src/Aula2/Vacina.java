package Aula2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vacina {
    private LocalDate dataInicial;

    Vacina(LocalDate data){
        this.dataInicial = data;
    }

    public void datasDasPróximasVacinas(){
        System.out.println("Primeira dose: " + dataInicial.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Segunda dose: " + dataInicial.plusMonths(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Terceira dose: " + dataInicial.plusMonths(2).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
