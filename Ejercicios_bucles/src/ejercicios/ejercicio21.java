package ejercicios;

import java.util.Scanner;

public class ejercicio21
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		int num2;
		int i;
		
		System.out.println("Introduce un número");
		num = scan.nextInt();
		num2 = num;
		for (i = 0; i < 100; i++)
		{
			num += num2 + 1;
			num2++;
		}
		System.out.println("La suma de todos los numero es: " + num);
	}
}