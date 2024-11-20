package ejercicios;

import java.util.Scanner;

public class ejercicio28
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el número de hombres en el aula: ");
		int hombres = scan.nextInt();
		System.out.println("Ingresa el número de mujeres en el aula: ");
		int mujeres = scan.nextInt();
		int total = hombres + mujeres;
		double porc = (hombres * 100) / total;
		System.out.println("Hay un " + porc + "% de hombres");
		System.out.println("Hay un " + (100 - porc) + "% de mujeres");
	}
}