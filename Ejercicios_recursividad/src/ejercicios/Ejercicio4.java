package ejercicios;

import java.util.Scanner;

public class Ejercicio4
{
	private static boolean ft_isdigit(String str, int i, int len)
	{
		if ((str.charAt(i) < 48 || str.charAt(i) > 57) && len >= i)
		{
			return false;
		}
		else if (len <= i)
		{
			return true;
		}
		boolean p = ft_isdigit(str, i + 1, len);
		return p;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		String str = scan.nextLine();
		int len = str.length() - 1;
		boolean p = ft_isdigit(str, 0, len);
		if (p)
			System.out.println("La cadena solo tiene numeros");
		else
			System.out.println("La cadena tiene mas caracteres aparte de numeros");
	}
}