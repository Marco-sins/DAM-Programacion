package ejercicios;

import java.util.Scanner;

public class ejercicio1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String str = scan.nextLine();
		char c;
		String st = "";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			c = str.charAt(i);
			st += c;
		}
		System.out.println("La frase original es: " + str);
		System.out.println("El palindromo de la palabra es: " + st);
	}
}