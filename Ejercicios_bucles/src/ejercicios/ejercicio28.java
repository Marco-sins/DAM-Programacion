package ejercicios;

import java.util.Scanner;

public class ejercicio28
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		int div;
		int i;
		
		System.out.println("Ingrese un numero");
		num = scan.nextInt();
		System.out.println("Ingrese el divisor");
		div = scan.nextInt();
		for (i = 0; i <= num; i++)
		{
			if (i % div != 0)
				System.out.println(i);
		}
	}
}