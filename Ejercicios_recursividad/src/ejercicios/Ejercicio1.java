package ejercicios;

import java.util.Scanner;

public class Ejercicio1
{
	private static int sumatorio(int n, int num)
	{
		if (n >= 10)
		{
			num = sumatorio(n / 10, num);
			num = sumatorio(n % 10, num);
		}
		else
			num += n;
		return (num);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num = scan.nextInt();
		int total = sumatorio(num, 0);
		System.out.println(total);
		return ;
	}
}