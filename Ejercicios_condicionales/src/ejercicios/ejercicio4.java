package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de horas trabajadas: ");
		int horas = scan.nextInt();
		int total = 0;
		if (horas < 0)
			System.out.println("Eres tonto");
		else if (horas <= 40)
		{
			total = horas * 12;
		}
		else if (horas > 40)
		{
			total = 40 * 12;
			horas -= 40;
			total += horas * 16;
		}
		System.out.println("La cantidad ganada esta semana es: " + total);
	}
}