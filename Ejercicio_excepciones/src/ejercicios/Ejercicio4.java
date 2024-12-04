package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = (int) (Math.random() * 100) + 1;
		int[] v = new int[n];
		
		n--;
		System.out.println("El vector va desde el 0 hasta el " + n);
		while (n >= 0)
		{
			v[n] = (int) (Math.random() * 10) + 1;
			n--;
		}
		n = 0;
		while (n >= 0)
		{
			try
			{
				System.out.println("Introduce la posicion que deseas ver");
				n = scan.nextInt();
				while (n >= 0)
				{
					System.out.println(v[n]);
					System.out.println("Introduce otra posicion o un valor negativo para terminar");
					n = scan.nextInt();
				}
			}
			catch (InputMismatchException e)
			{
				System.out.println("No has introducido un numero valida");
				scan = new Scanner(System.in);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Esa posicion se sale de los limites del array");
			}
		}
		System.out.println("Programa finalizado");
		scan.close();
	}
}