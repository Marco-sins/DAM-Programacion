package ejercicios;

import java.util.Scanner;

public class ejercicio21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el número de alumnos que van al viaje");
		int alum = scan.nextInt();
		if (alum > 0)
		{
			if (alum >= 100)
				System.out.println("Cada alumno debe pagar 65€");
			else if (alum >= 50 && alum <= 99)
				System.out.println("Cada alumno debe pagar 70€");
			else if (alum >= 30 && alum <= 49)
				System.out.println("Cada alumno debe pagar 95€");
			else
				System.out.println("Cada alumno debe pagar " + 4000 / alum + "€");
		}
		else 
			System.out.println("Error");
	}
}