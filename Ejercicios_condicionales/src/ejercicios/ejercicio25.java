package ejercicios;

import java.util.Scanner;

public class ejercicio25 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el total de la compra: ");
		double total = scan.nextInt();
		System.out.println("Ingresa el dia que es: ");
		String dia = scan.next();
		double desc = 0;
		if (dia.equals("martes") || dia.equals("jueves"))
		{
			desc = total * 0.15;
			total = total - desc;
			System.out.println("Se le ha descontado: " + desc + "€");
		}
		System.out.println("El importe total es: " + total);
	}
}