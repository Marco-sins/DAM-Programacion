package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número comprendido entre 0 y 9999");
		int num1 = scan.nextInt();
		String num = String.valueOf(num1);
		if (num.length() <= 1)
			System.out.println("El número no es capicúa");
		else if (num.length() == 2)
		{
			if (num.charAt(0) == num.charAt(1))
				System.out.println("El número es capicúa");
			else
				System.out.println("El número no es capicúa");
		}
		else if (num.length() == 3)
		{
			if (num.charAt(0) == num.charAt(2))
				System.out.println("El número es capicúa");
			else
				System.out.println("El número no es capicúa");
		}
		else if (num.length() == 4)
		{
			if ((num.charAt(0) == num.charAt(3)) && num.charAt(1) == num.charAt(2))
				System.out.println("El número es capicúa");
			else
				System.out.println("El número no es capicúa");
		}
		else
			System.out.println("El número esta fuera de los limites.");
	}
}