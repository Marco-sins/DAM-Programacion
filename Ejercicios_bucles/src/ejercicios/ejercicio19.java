package ejercicios;

import java.util.Scanner;

public class ejercicio19
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int num;
		int parity;
		
		parity = 0;
		num = 0;
		for (i = 1; i <= 10; i++)
		{
			System.out.println("Ingrese un número");
			num = scan.nextInt();
			if (num < 0)
				parity++;
		}
		System.out.println("La cantidad de números negativos es: " + parity);
		System.out.println("La cantidad de número positovos es: " + (10 - parity));
	}
}