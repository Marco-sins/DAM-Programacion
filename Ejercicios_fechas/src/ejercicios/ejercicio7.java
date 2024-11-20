package ejercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class ejercicio7 {
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(1940, 10, 31);
		DayOfWeek dia = fecha.getDayOfWeek();
		String dia_es = dia.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		System.out.println(dia_es);
	}
}