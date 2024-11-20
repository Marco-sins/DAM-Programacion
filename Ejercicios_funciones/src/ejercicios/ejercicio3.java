package ejercicios;

import java.util.Scanner;

public class ejercicio3
{
	private static void primo(int n)
	{
		int i = 1;
		int j = 0;
		while (n >= i)
		{
			if(n % i == 0)
				j++;
			i++;
		}
		if (j == 2)
			System.out.println(n);
		return ;
	}
	
	private static void divisores(int n)
	{
		int i;
		
		i = 1;
		while (i <= n)
		{
			if (n % i == 0)
				primo(i);
			i++;
		}
		return ;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int n = scan.nextInt();
		divisores(n);
		return ;
	}
}