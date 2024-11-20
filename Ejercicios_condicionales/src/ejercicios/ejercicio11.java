package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num = scan.nextInt();
		if ((num % 2 == 0) && (num % 5 == 0))
			System.out.println("El número es par y divisible entre 5");
		else if ((num % 2 == 0))
			System.out.println("El número es par pero no divisible entre 5");
		else if ((num % 5 == 0))
			System.out.println("El número no es par pero si divisible entre 5");
		else
			System.out.println("El número no es par ni divisible entre 5");
	}
}