package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2
{
	private static int[] ft_order(int ar[])
	{
		int i;
		int n;
		
		i = 1;
		while (i < ar.length)
		{
			if (ar[i] > ar[i - 1])
			{
				n = ar[i - 1];
				ar[i - 1] = ar[i];
				ar[i] = n;
				i = 0;
			}
			i++;
		}
		return (ar);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int ar[] = new int[0];
		int n;
		int i;
		double media = 0;
		System.out.println("Introduzca su salario");
		n = scan.nextInt();
		for (i = 0; n != -1; i++)
		{
			media += n;
			ar = Arrays.copyOf(ar, i + 1);
			ar[i] = n;
			System.out.println("Introduzca su salario");
			n = scan.nextInt();
		}
		media /= i;
		ar = ft_order(ar);
		System.out.println("Los salarios ordenados de mayor a menor: " + Arrays.toString(ar));
		System.out.println("El salario maximo es: " + ar[0]);
		System.out.println("El salario mínimo es: " + ar[i - 1]);
		System.out.println("La media de todos los salarios es: " + media);
	}
}