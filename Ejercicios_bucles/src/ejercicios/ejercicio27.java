package ejercicios;

import java.util.Scanner;

public class ejercicio27
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n;
		int i;
		int cant;
		int sum;
		
		System.out.println("Ingrese un numero");
		n = scan.nextInt();
		cant = 0;
		sum = 0;
		for (i = 1; i <= n; i++)
		{
			if (i % 3 == 0)
			{
				System.out.print(i + " ");
				cant++;
				sum += i;
			}
		}
		System.out.println("\nHay " + cant + " numeros");
		System.out.println("La suma de todos los numeros es: " + sum);
	}
}