package ejercicios;

import java.util.Scanner;

public class ejercicio7
{
	private static void circulo(double radio)
	{
		double result = (radio * radio) * 3.14;
		System.out.println(result);
		return;
	}
	
	private static void triangulo(double base, double altura)
	{
		double result = (base * altura) / 2;
		System.out.println(result);
		return;
	}
	
	private static void cuadrado(double lado)
	{
		double result = lado * lado;
		System.out.println(result);
		return;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("¿De que figura quieres calcular el area (circulo, triangulo o cuadrado)");
		String type = scan.nextLine();
		if (type.equals("circulo"))
		{
			System.out.println("Introduce el radio");
			circulo(scan.nextDouble());
		}
		if (type.equals("triangulo"))
		{
			System.out.println("Introduce la base");
			double base = scan.nextDouble();
			System.out.println("Introduce la altura");
			double altura = scan.nextDouble();
			triangulo(base, altura);
		}
		if (type.equals("cuadrado"))
		{
			System.out.println("Introduce el lado");
			cuadrado(scan.nextDouble());
		}
		return;
	}
}