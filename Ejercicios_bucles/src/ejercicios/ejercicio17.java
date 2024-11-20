package ejercicios;

import java.util.Scanner;

public class ejercicio17
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		int media;
		int cant;
		
		num = 0;
		media = 0;
		cant = 0;
		while (!(num < 0))
		{
			System.out.println("Introduce un número");
			num = scan.nextInt();
			if (num != -1)
			{
				media += num;
				cant++;
			}
		}
		System.out.println("La media de todos los números es: " + media / cant);
	}
}