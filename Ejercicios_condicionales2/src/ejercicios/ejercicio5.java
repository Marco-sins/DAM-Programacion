package ejercicios;

import java.util.Scanner;

public class ejercicio5
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la base del triángulo");
		double base = scan.nextDouble();
		System.out.println("Ingrese la altura del triángulo");
		double altura = scan.nextDouble();
		if (base <= 0 || altura <= 0)
			System.out.println("Error");
		else
			System.out.println("El área del triángulo es: " + (base / 2) * altura);
	}
}