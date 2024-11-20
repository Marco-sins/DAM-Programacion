package ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ejercicio4 {
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2020, 2, 29);
		LocalDate fecha2 = fecha.plus(30, ChronoUnit.DAYS);
		System.out.println(fecha2);
	}
}