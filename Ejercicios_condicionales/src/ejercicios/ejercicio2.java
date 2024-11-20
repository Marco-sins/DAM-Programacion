package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la hora: ");
		int hora = scan.nextInt();
		if (hora <= 24 && hora >= 0)
		{
			if (hora >= 6 && hora <= 12)
				System.out.println("Buenos días");
			else if (hora >= 13 && hora <= 20)
				System.out.println("Buenos tardes");
			else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5))
				System.out.println("Buenos noches");
		}
		else
			System.out.println("¿Cómo de fuerte te pegan tus padres?");
	}
}