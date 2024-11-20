package ejercicios;

import java.util.Scanner;

public class ejercicio24 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el total de la compra");
		double total = scan.nextInt();
		System.out.println("¿Desea pagar al contado o con tarjeta? (contado/tarjeta)");
		String modo = scan.next();
		double desc = 0;
		if (modo.equals("contado"))
		{
			desc = total * 0.05;
			total = (total - desc);
			System.out.println("Se le ha aplicado un descuento de: " + desc);
		}
		else if (modo.equals("tarjeta"))
		{
			desc = total * 0.03;
			total = (total + desc);
			System.out.println("Se le ha aplicado un impuesto de: " + desc);
		}
		else 
			System.out.println("Error");
		System.out.println("El pago total es: " + total);
	}
}