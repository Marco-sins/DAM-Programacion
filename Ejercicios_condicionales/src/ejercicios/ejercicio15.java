package ejercicios;

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la nota del primer control ");
		int nota1 = scan.nextInt();
		System.out.println("Ingrese la nota del segundo control ");
		int nota2 = scan.nextInt();
		double media = (nota1 + nota2) / 2;
		if (media >= 5)
			System.out.println("Tu nota de Programación es: " + media);
		else
		{
			System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
			String recu = scan.next();
			if (recu.equals("apto"))
				System.out.println("Tu nota de Programación es: " + 5);
			else
				System.out.println("Tu nota de Programación es: " + media);
		}
	}
}