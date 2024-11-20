package ejercicios;

import java.util.Scanner;

public class ejercicio12
{
	private static double ft_tienda(String lugar, double cant)
	{
		double total = 0;
		if (lugar.equals("fruta"))
		{
			total = cant * 0.5;
			if (total >= 100)
				total = total - (total * 0.2);
		}
		else if (lugar.equals("verdura"))
		{
			total = cant * 0.75;
			if (total >= 100)
				total = total - (total * 0.2);
		}
		else if (lugar.equals("helado"))
		{
			total = cant * 1;
			if (total >= 100)
				total = total - (total * 0.2);
		}
		return (total);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i = 1;
		double total = 0;
		while (i == 1)
		{
			System.out.println("Ingresa en que sección ha comprado (fruta, verdura y helado)");
			String lugar = scan.next();
			System.out.println("Ingresa cuanto has comprado en esa sección");
			double cant = scan.nextDouble();
			total += ft_tienda(lugar, cant);
			System.out.println("Ingresa 1 si quiere comprar de nuevo, 0 si ha terminado");
			i = scan.nextInt();
		}
		System.out.println("El total es: " + total);
	}
}