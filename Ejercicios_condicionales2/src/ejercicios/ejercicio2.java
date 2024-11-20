package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese tu número de DNI");
		int num = scan.nextInt();
		int result = num % 23;
		if (num > 100000000 || num < 0)
			System.out.println("El número esta fuera de los límites");
		else if (result == 0)
			System.out.println("La letra del DNI es: T");
		else if (result == 1)
			System.out.println("La letra del DNI es: R");
		else if (result == 2)
			System.out.println("La letra del DNI es: W");
		else if (result == 3)
			System.out.println("La letra del DNI es: A");
		else if (result == 4)
			System.out.println("La letra del DNI es: G");
		else if (result == 5)
			System.out.println("La letra del DNI es: M");
		else if (result == 6)
			System.out.println("La letra del DNI es: Y");
		else if (result == 7)
			System.out.println("La letra del DNI es: F");
		else if (result == 8)
			System.out.println("La letra del DNI es: P");
		else if (result == 9)
			System.out.println("La letra del DNI es: D");
		else if (result == 10)
			System.out.println("La letra del DNI es: X");
		else if (result == 11)
			System.out.println("La letra del DNI es: B");
		else if (result == 12)
			System.out.println("La letra del DNI es: N");
		else if (result == 13)
			System.out.println("La letra del DNI es: J");
		else if (result == 14)
			System.out.println("La letra del DNI es: Z");
		else if (result == 15)
			System.out.println("La letra del DNI es: S");
		else if (result == 16)
			System.out.println("La letra del DNI es: Q");
		else if (result == 17)
			System.out.println("La letra del DNI es: V");
		else if (result == 18)
			System.out.println("La letra del DNI es: H");
		else if (result == 19)
			System.out.println("La letra del DNI es: L");
		else if (result == 20)
			System.out.println("La letra del DNI es: C");
		else if (result == 21)
			System.out.println("La letra del DNI es: K");
		else if (result == 22)
			System.out.println("La letra del DNI es: E");
	}
}