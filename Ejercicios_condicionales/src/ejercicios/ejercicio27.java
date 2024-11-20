package ejercicios;

import java.util.Scanner;

public class ejercicio27
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa una letra");
		String str = scan.next();
		char c = str.charAt(0);
		if (c >= 65 && c <= 90)
			System.out.println("La letra es mayúscula");
		else
			System.out.println("La letra no es mayúscula");
	}
}