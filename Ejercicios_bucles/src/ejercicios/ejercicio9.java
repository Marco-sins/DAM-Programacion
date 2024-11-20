package ejercicios;

import java.util.Scanner;

public class ejercicio9
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		
		System.out.println("Introduce un número");
		j = scan.nextInt();
		for (i = 0; i <= 10; i++)
			System.out.println(i * j);
	}
}