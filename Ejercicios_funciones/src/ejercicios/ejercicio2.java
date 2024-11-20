package ejercicios;

import java.util.Scanner;

public class ejercicio2
{
	private static void iteri(int a, int b)
	{
		if (a < b)
		{
			a++;
			while (a < b)
			{
				System.out.println(a);
				a++;
			}
		}
		else if (a > b)
		{
			b++;
			while (a > b)
			{
				System.out.println(b);
				b++;
			}
		}
		else
			System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int a = scan.nextInt();
		System.out.println("Ingrese otro numero entero");
		int b = scan.nextInt();
		iteri(a, b);
	}
}