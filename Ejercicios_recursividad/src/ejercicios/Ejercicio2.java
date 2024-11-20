package ejercicios;

import java.util.Scanner;

public class Ejercicio2
{
	private static boolean ft_palindromo(String str, int len, int i)
	{
		if (str.charAt(i) != str.charAt(len) && len >= i)
		{
			return false;
		}
		else if (len <= i)
		{
			return true;
		}
		boolean p = ft_palindromo(str, len - 1, i + 1);
		return p;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una palabra o frase");
		String str = scan.nextLine();
		String st = "";
		int len = str.length() - 1;
		boolean v;
		for (int i = 0; i <= len; i++)
		{
			if (str.charAt(i) != ' ')
				st += str.charAt(i);
		}
		len = st.length() - 1;
		v = ft_palindromo(st, len, 0);
		if (v)
			System.out.println("Es palindromo");
		else
			System.out.println("No es palindromo");
	}
}