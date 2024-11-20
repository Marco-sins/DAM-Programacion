package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el dia de la semana por el número: ");
		int dia = scan.nextInt();
		if (dia > 0 && dia <= 7)
		{
			if (dia == 1)
				System.out.println("Hoy es Lunes");
			else if (dia == 2)
				System.out.println("Hoy es Martes");
			else if (dia == 3)
				System.out.println("Hoy es Miércoles");
			else if (dia == 4)
				System.out.println("Hoy es Jueves");
			else if (dia == 5)
				System.out.println("Hoy es Viernes");
			else if (dia == 6)
				System.out.println("Hoy es Sábado");
			else if (dia == 7)
				System.out.println("Hoy es Domingo");
		}
		else
			System.out.println("¿Te sabes los días de la semana?");
	}
}