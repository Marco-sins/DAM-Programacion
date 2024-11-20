package ejercicios;

import java.util.Scanner;

public class ejercicio25
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int 	num;
		int 	total;
		int		i;
		
		num = 0;
		total = 0;
		i = 0;
		while (total < 10000)
		{
			System.out.println("Ingrese un número");
			num = scan.nextInt();
			total += num;
			i++;
		}
		System.out.println("El número total acumulado es: " + total);
		System.out.println("La cantidad de numeros ingresados son: " + i);
		System.out.println("La media de todos los numeros es: " + (total / i));
	}
}