package ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ejercicio5 {
	public static void main(String[] args) {
		Period p = LocalDate.parse("2001-10-07").
				until(LocalDate.parse("2004-05-10"));
		long totalDias = ChronoUnit.DAYS.between(LocalDate.of(2001, 10, 7),
				LocalDate.of(2004, 5, 10));
		System.out.println(totalDias + " de dias han pasado");
		}
}