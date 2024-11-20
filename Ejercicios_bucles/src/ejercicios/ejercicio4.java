package ejercicios;

import java.util.Scanner;

public class ejercicio4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int altura;
		int max;
		int id;
		int numarb;
		int diff;
		
		altura = 0;
		max = 0;
		id = 1;
		numarb = 0;
		while (altura != -1)
		{
			System.out.println("Introduce la altura del árbol" + " (-1 para terminar)");
			altura = scan.nextInt();
			numarb++;
			if (altura > max)
			{
				max = altura;
				diff = numarb - id;
				id += diff;
			}
		}
		System.out.println("El árbol con la ID " + id + ", es el mas alto y mide: " + max);
	}
}