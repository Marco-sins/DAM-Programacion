package ejercicios;

import java.util.Scanner;

public class ejercicio4
{
	private static void calc(int a, int b, int ope)
	{
		int result = 0;
		if (ope == 1)
			result = a + b;
		else if (ope == 2)
			result = a - b;
		else if (ope == 3)
			result = a * b;
		else if (ope == 4)
			result = a / b;
		else
		{
			System.out.println("Error");
			return;
		}
		System.out.println(result);
		return;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int a = scan.nextInt();
		System.out.println("Ingrese otro numero entero");
		int b = scan.nextInt();
		System.out.println("Ingrese el operando con el numero (1 suma, 2 resta, 3 multiplicar, 4 dividir)");
		int ope = scan.nextInt();
		calc (a, b, ope);
		return ;
	}
}