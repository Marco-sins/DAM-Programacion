package ejercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ejercicio12 {
    public static void main(String[] args) {
		LocalDate año = LocalDate.of(2020, 9, 1);
		DayOfWeek dia = año.getDayOfWeek();
        System.out.println("El primer dia de Septiembre de 2020 fue: " + dia);   
    }
}

