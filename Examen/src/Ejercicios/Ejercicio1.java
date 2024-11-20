package Ejercicios;

import java.util.Scanner;

public class Ejercicio1
{
	public static void main(String[] args)
	{
		int	num;
		int	i;
		int	perfecto;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número para ver si es perfecto");		//Declaración de variables
		
		num = scan.nextInt();
		i = 1;
		perfecto = 0;
		while (i < num)
		{
			if (num % i == 0)						//Vemos si el número es divisible
			{
				perfecto += i;
				System.out.println(i + " ");		//Si es divisible sumamos el divisor a un sumatorio
			}
			i++;									//Iteramos sobre un número para ir viendo los divisores
		}
		if (perfecto == num)						//Si el sumatorio al final es igual al número introducido por pantalla significa que es perfecto
			System.out.println("El número es perfecto");
		else
			System.out.println("El número no es perfecto");		//En caso de que no lo sea significa que no es perfecto
	}
}