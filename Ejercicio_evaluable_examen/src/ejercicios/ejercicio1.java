package ejercicios;

import java.util.Scanner;

public class ejercicio1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		int i;
		int aux;
		int j;
		
		System.out.println("Ingrese un número para saber todos sus divisores");
		num = scan.nextInt();
		i = 1;
		System.out.println("Los divisores del número son: ");
		if (num > 0)
		{
			while (num >= i)
			{
				if (num % i == 0)
					System.out.println(i);
				i++;
			}
			i = 1;
			System.out.println("Los divisores primos del numero son: ");
			while (num >= i)
			{
				if (num % i == 0)
				{
					j = 0;
					aux = 1;
					while (i >= aux)
					{
						if(i % aux == 0)
							j++;
						aux++;
					}
					if (j == 2)
						System.out.println(i);
				}
				i++;
			}
		}
		else
			System.out.println("Error");
	}
}