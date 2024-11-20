package ejercicios;

import java.util.Scanner;

public class ejercicio10
{
	private static void libra(double euro)
	{
		double result = euro * 0.86;
		System.out.println(result);
		return;
	}
	
	private static void dolar(double euro)
	{
		double result = euro * 1.28611;
		System.out.println(result);
		return;
	}
	
	private static void yen(double euro)
	{
		double result = euro * 129.852;
		System.out.println(result);
		return;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la cantidad de euros");
		double euro = scan.nextDouble();
		System.out.println("Introduce a que quieres convertir (libra, dolar, yen)");
		String type = scan.next();
		if (type.equals("libra"))
			libra(euro);
		if (type.equals("dolar"))
			dolar(euro);
		if (type.equals("yen"))
			yen(euro);
		return;
	}
}