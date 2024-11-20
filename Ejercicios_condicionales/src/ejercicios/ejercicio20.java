package ejercicios;

import java.util.Scanner;

public class ejercicio20 {
	public static void main(String[] args) {
		String type;
		int size;
		float init;
		float total;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el precio inicial: ");
		init = scan.nextInt();
		System.out.println("Escribe el tipo de la uva (a/b): ");
		type = scan.next();
		System.out.println("Escribe el tamaño (1/2): ");
		size = scan.nextInt();
		total = 0;
		if (type.equals("a") || type.equals("A") || type.equals("b") || type.equals("B"))
		{
			if (size != 1 || size != 2)
				System.out.println("Error en el tamaño de la uva");
			else
			{
				if (type.equals("a") || type.equals("A"))
				{
					if (size == 1)
						total = (float) (init + (init * 0.2));
					else
						total = (float) (init + (init * 0.3));
				}
				if (type.equals("b") || type.equals("B"))
				{
					if (size == 1)
						total = (float) (init + (init * 0.3));
					else
						total = (float) (init + (init * 0.5));
				}
				System.out.println("El precio total es: " + total);
			}
		}
		else
			System.out.println("Error en el tipo de la uva");
	}
}