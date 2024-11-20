package ejercicios;

import java.util.Scanner;

public class ejercicio11
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		int total;
		
		System.out.println("Introduce un número");
		j = scan.nextInt();
		total = j;
		for (i = j - 1; i != 0; i--)
			total *= i;
		System.out.println("El factorial es: " + total);
	}
}