package ejercicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class ejercicio8 {
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		Month mes = fecha.getMonth();
		String meses = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		System.out.println("Estamos en: " + meses);
		}
}