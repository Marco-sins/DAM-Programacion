package ejercicios;

import java.util.Scanner;

public class ejercicio7
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num1 = (int) (Math.random() * 99) + 1;
		int num2 = (int) (Math.random() * 99) + 1;
		int ope = (int) (Math.random() * 3) + 1;
		int result = 0;
		if (ope == 1)
		{
			result = num1 + num2;
			System.out.println("¿Cuánto es " + num1 + " + " + num2 + "?");
		}
		else if (ope == 2)
		{
			result = num1 - num2;
			System.out.println("¿Cuánto es " + num1 + " - " + num2 + "?");
		}
		else
		{
			result = num1 * num2;
			System.out.println("¿Cuánto es " + num1 + " * " + num2 + "?");
		}
		int result_user = scan.nextInt();
		if (result == result_user)
			System.out.println("Correcto");
		else 
			System.out.println("Incorrecto, la respuesta es " + result);
	}
}