package ejercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ejercicio6 {
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		LocalDate fecha2 = fecha.minus(3, ChronoUnit.DAYS);
		DayOfWeek dia = fecha2.getDayOfWeek();
		System.out.println("Hace tres dias fue " + dia);
		}
}