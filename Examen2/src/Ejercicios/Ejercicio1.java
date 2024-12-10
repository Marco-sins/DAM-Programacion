package Ejercicios;

import java.util.Scanner;

public class Ejercicio1
{
	private static boolean ft_narcisista(int n)
	{
		int aux;
		int total;
		int len;
		
		aux = n;
		len = 0;
		total = 0;
		while (n > 0)
		{
			n /= 10;				//mido el numero
			len++;
		}
		n = aux;
		while (n > 0)
		{
			total += Math.pow(n % 10, len);			//miro si es narcisista
			n /= 10;
		}
		if (total == aux)
			return (true);					//verifico si lo es
		return (false);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero entero positivo");
		int n = scan.nextInt();
		System.out.println(ft_narcisista(n));
	}
}