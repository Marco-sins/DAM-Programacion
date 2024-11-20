package ejercicios;

import java.util.Scanner;

public class Ejercicio3
{
	private static int ft_potencia(int num, int i, int n, int k)
	{
		if (i <= n)
		{
			num += Math.pow(i,  k);
			i++;
			num = ft_potencia (num, i, n, k);
		}
		return num;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce n");
		int n = scan.nextInt();
		System.out.println("Introduce k");
		int k = scan.nextInt();
		int num = ft_potencia (0, 1, n, k);
		System.out.println(num);
	}
}