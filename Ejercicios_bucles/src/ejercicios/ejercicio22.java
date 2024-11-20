package ejercicios;

import java.util.Scanner;

public class ejercicio22
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		
		System.out.println("Ingrese el primer numero");
		i = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		j = scan.nextInt();
		while (i <= j)
		{
			System.out.println(i);
			i += 7;
		}
	}
}