package ejercicios;

import java.util.Scanner;

public class ejercicio19 {
	public static void main(String[] args) {
		System.out.println("Introduce el largo del rectángulo");
		Scanner scan = new Scanner(System.in);
		double largo = scan.nextDouble();
		System.out.println("Introduce el ancho del rectángulo");
		double ancho = scan.nextDouble();
		double area = ancho * largo;
		System.out.println(area);
	}
} 