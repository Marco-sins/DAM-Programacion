package ejercicios;

import java.util.Scanner;

public class ejercicio30
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int cant;
		int random;
		int p;
		int cero;
		int menor;
		int mayor;
		
		System.out.println("Ingrese la cantidad de numeros que quieres");
		cant = scan.nextInt();
		p = 0;
		cero = 0;
		menor = 0;
		mayor = 0;
		while (cant > 0)
		{
			random = (int) (Math.random() * 11);
			p = (int) (Math.random() * 2) + 1;
			if (p == 1)
				random *= -1;
			if (random == 0)
				cero++;
			else if (random < 0)
				menor++;
			else if (random > 0)
				mayor++;
			cant--;
			System.out.print(random + " ");
		}
		System.out.println("\nHay " + cero + " numeros iguales a 0");
		System.out.println("Hay " + menor + " numeros menores que 0");
		System.out.println("Hay " + mayor + " numeros mayores que 0");
	}
}