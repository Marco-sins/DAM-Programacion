package ejercicios;

import java.util.Scanner;

public class ejercicio24
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int altura;
		String msg;
		char c;
		int n;
		
		System.out.println("Ingrese la letra de la piramide");
		msg = scan.next();
		c = msg.charAt(0);
		System.out.println("Ingrese la altura de la piramide");
		n = scan.nextInt();
		altura = n;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j < altura; j++)
				System.out.print(" ");
			for (int j = 1; j <= (2 * i - 1); j++)
			{
				if ((j == 1 || j == (2 * i - 1)) && n != i)
					System.out.print(c);
				else if (n == i)
					System.out.print(c);
				else
					System.out.print(" ");
			}
			System.out.println();
			altura--;
		}	
	}
}