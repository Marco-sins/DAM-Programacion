package ejercicios;

import java.util.Scanner;

public class ejercicio26
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la temperatura: ");
		double total = scan.nextInt();
		if (total <= 10)
			System.out.println("Frío");
		else if (total > 10 && total <= 20)
			System.out.println("Nublado");
		else if (total > 20 && total <= 30)
			System.out.println("Caluroso");
		else if (total > 30)
			System.out.println("Tropical");
	}
}