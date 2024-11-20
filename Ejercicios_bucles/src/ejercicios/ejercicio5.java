package ejercicios;

import java.util.Scanner;

public class ejercicio5
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		int a;
		int b;
		int total;
		
		num = 0;
		a = 0;
		b = 0;
		total = -1;
		while (a != -1)
		{
			total++;
			a = (int) (Math.random() * 100) + 1;
			b = (int) (Math.random() * 100) + 1;
			System.out.println(a + " + " + b);
			num = scan.nextInt();
			if (num != (a + b))
				a = -1;
		}
		System.out.println("El récord es: " + total);
	}
}