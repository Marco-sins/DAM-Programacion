package ejercicios;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce a: ");
		int a = scan.nextInt();
		System.out.println("Introduce b: ");
		int b = scan.nextInt();
		System.out.println("Introduce c: ");
		int c = scan.nextInt();
		String error = "";
		int dentro_raiz = ((b * b) - (4 * a * c));
		if (dentro_raiz < 0)
			error = "Error";
		double raiz = Math.sqrt(dentro_raiz);
		double total1 = (-b + raiz) / (a * 2);
		double total2 = (-b - raiz) / (a * 2);
		if (error.equals("Error"))
				System.out.println(error);
		else
			System.out.println("Las soluciones son: " + total1 + " y " + total2);
	}
}