package ejercicios;

import java.util.Scanner;

public class ejercicio23 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el destino del paquete");
		String pais = scan.nextLine();
		System.out.println("Ingresa el peso del paquete");
		int peso = scan.nextInt();
		int costo = 0;
		if (peso <= 5)
		{
			if (pais.equals("america del norte"))
				costo = peso * 24;
			else if (pais.equals("america del sur"))
				costo = peso * 21;
			else if (pais.equals("america central"))
				costo = peso * 20;
			else if (pais.equals("europa"))
				costo = peso * 10;
			else if (pais.equals("asia"))
				costo = peso * 18;
			else
				System.out.println("Pais mal ingresado");
			System.out.println("El costo es de: " + costo);
		}
		else
			System.out.println("Paquete rechazado");
	}
}