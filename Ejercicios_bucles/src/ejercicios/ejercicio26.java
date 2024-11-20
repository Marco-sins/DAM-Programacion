package ejercicios;

import java.util.Scanner;

public class ejercicio26
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String msg;
		String str;
		char c;
		int n;
		int len;
		
		System.out.println("Introduce un numero");
		n = scan.nextInt();
		msg = String.valueOf(n);
		len = msg.length();
		str = "";
		while (len > 0)
		{
			c = msg.charAt(len - 1);
			str += c;
			len--;
		}
		System.out.println("El numero al reves es: " + str);
	}
}