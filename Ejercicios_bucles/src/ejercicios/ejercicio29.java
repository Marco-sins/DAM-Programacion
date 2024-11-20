package ejercicios;

import java.util.Scanner;

public class ejercicio29
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int altura;
		int base;
		
		System.out.println("Ingrese la altura de la L");
		altura = scan.nextInt();
		base = altura / 2;
		while (altura > 0)
		{
			System.out.print("\n*");
			altura--;
		}
		while (base > 0)
		{
			System.out.print("*");
			base--;
		}
	}
}