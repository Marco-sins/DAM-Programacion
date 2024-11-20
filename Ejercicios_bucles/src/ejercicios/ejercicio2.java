package ejercicios;

import java.util.Scanner;

public class ejercicio2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int edad;
		int cant;
		int sumatorio;
		int mayor;
		
		edad = 0;
		cant = -1;
		sumatorio = 0;
		mayor = 0;
		while (!(edad < 0))
		{
			cant++;
			sumatorio += edad;
			if (edad >= 18)
				mayor++;
			System.out.println("Introduce la edad del alumno" + " (Numero negativo para terminar)");
			edad = scan.nextInt();
		}
		System.out.println("La suma de todas las edades es: " + sumatorio);
		System.out.println("La edad media de alumnos del centro educativo es: " + sumatorio / cant);
		System.out.println("La cantidad de alumnos es: " + cant);
		System.out.println("La cantidad de mayores de edad es: " + mayor);
	}
}