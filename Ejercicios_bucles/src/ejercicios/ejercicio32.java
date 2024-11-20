package ejercicios;

import java.util.Scanner;

public class ejercicio32
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int mes;
		int pagar;
		int total;
		
		i = 1;
		mes = 20;
		pagar = 10;
		total = pagar;
		while (i == 1)
		{
			while (mes > 0)
			{
				System.out.println("Debe pagar " + pagar + "€");
				pagar *= 2;
				mes--;
				total += pagar;
			}
			System.out.println("El total a pagar es: " + total + "€");
			System.out.println("Introduce un 1 si quiere probar con una tuya, 0 si quiere terminar");
			i = scan.nextInt();
			if (i == 1)			
			{
				System.out.println("Introduce el plazo a pagar en meses");
				mes = scan.nextInt();
				System.out.println("Introduce la cantidad a pagar en el primer mes");
				pagar = scan.nextInt();
				total = pagar;
			}
		}
		System.out.println("El programa ha terminado");
	}
}