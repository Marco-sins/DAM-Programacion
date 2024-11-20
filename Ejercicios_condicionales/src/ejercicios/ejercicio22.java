package ejercicios;

import java.util.Scanner;

public class ejercicio22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuánto ha durado la llamada?");
		int t = scan.nextInt();
		System.out.println("¿Qué dia fue la llamada?");
		String dia = scan.next();
		System.out.println("¿Fue por la mañana o por la tarde?");
		String hora = scan.next();
		float total = 0;
		float impuesto = 0;
		if (t > 0)
		{
			if (hora.equals("mañana"))
			{
				impuesto = (float) 0.15;
				total += 1 + (1 * impuesto);
				if (t > 5)
					total += 0.8 + (0.8 * impuesto);
				if (t > 8)
					total += 0.7 + (0.7 * impuesto);
				if (t > 10)
					total += 0.5 + (0.5 * impuesto);
			}
			else
			{
				impuesto = (float) 0.1;
				total += 1 + (1 * impuesto);
				if (t > 5)
					total += 0.8 + (0.8 * impuesto);
				if (t > 8)
					total += 0.7 + (0.7 * impuesto);
				if (t > 10)
					total += 0.5 + (0.5 * impuesto);
			}
			if (dia.equals("domingo"))
				total += total * 0.03;
			System.out.println("El total a pagar es: " + total);
		}
		else
			System.out.println("Error");
	}
}