package ejercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ejercicio11 {
	public static void main(String[] args) {
		LocalDate año = LocalDate.of(2005, 8, 27);
		System.out.println("Naci en el año " + año);
		DayOfWeek dia = año.getDayOfWeek();
		System.out.println("El dia en que nací era " + dia);
	}
}