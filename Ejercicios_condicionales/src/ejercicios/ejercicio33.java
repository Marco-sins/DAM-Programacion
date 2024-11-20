package ejercicios;

import java.util.Scanner;

public class ejercicio33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe las horas trabajadas: ");
		int horas = scan.nextInt();
		double total = 0;
		if (horas <= 20)
			total = horas * 12;
		else if (horas > 20 && horas < 30)
			total = horas * 15;
		else
			total = horas * 25;
		System.out.println("El sueldo total es: " + total);
	}
}