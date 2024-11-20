package ejercicios;

import java.util.Scanner;

public class ejercicio29
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa cuanto vas a comprar: ");
		int cant = scan.nextInt();
		System.out.println("Ingresa el coste del producto: ");
		double coste = scan.nextDouble();
		double total = cant * coste;
		double desc = 0;
		if (total < 50)
		{
			desc = total * 0.08;
			total = total - desc;
			System.out.println("Se le va a descontar un 8%, " + desc);
		}
		else
		{
			desc = total * 0.1;
			total = total - desc;
			System.out.println("Se le va a descontar un 10%, " + desc);
		}
		System.out.println("El coste total es: " + total);
	}
}