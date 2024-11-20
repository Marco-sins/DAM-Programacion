package ejercicios;

import java.util.Scanner;

public class ejercicio31
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un mensaje");
		String msg = scan.nextLine();
		char c = msg.charAt(0);
		while (c != ' ')
		{
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				System.out.println("ES VOCAL");
			else
				System.out.println("NO ES VOCAL");
			System.out.println("Ingrese un mensaje");
			msg = scan.nextLine();
			c = msg.charAt(0);
		}
		System.out.println("El programa ha finalizado");
	}
}