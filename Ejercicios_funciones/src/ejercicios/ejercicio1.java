package ejercicios;

import java.util.Scanner;

public class ejercicio1
{
	private static void repetir(int n)
	{
		while (n > 0)
		{
			System.out.println("Eco");;
			n--;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int n = scan.nextInt();
		repetir(n);
	}
}
