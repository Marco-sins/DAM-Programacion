package ejercicios;

import java.util.Scanner;

public class ejercicio6
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		
		System.out.println("Introduce un número");
		j = scan.nextInt();
		for (i = 1; i <= j; i++)
			System.out.println(i);
	}
}