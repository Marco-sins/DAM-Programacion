package ejercicios;

import java.util.Scanner;

public class ejercicio9
{
	private static void facto(int n)
	{
		int i;
		int result;
		
		result = 1;
		for (i = 1; i <= n; i++)
			result *= i;
		System.out.println(result);
		return;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int n = scan.nextInt();
		facto(n);
		return;
	}
}