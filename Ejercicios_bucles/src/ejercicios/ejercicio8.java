package ejercicios;

import java.util.Scanner;

public class ejercicio8
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int num;
		
		
		num = 0;
		for (i = 1; i <= 10; i++)
		{
			System.out.println("Introduce un número");
			num =+ scan.nextInt();
		}
		System.out.println("La media de todos los número es: " + num / i);
	}
}