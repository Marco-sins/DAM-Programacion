package ejercicios;

import java.util.Scanner;

public class ejercicio6
{
	private static void cambiador(int n, String str)
	{
		char c;
		int i;
		String st = "";
		while (n > 0)
		{
			c = str.charAt(n % 16);
			n /= 16;
			st += c;
		}
		i = st.length() - 1;
		while (i >= 0)
		{
			c = st.charAt(i);
			System.out.print(c);
			i--;
		}
		return ;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int n = scan.nextInt();
		cambiador (n, "0123456789ABCDEF");
		return ;
	}
}