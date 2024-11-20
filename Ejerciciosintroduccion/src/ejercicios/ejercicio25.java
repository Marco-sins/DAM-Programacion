package ejercicios;

import java.util.Scanner;

public class ejercicio25 {
	public static void main(String[] args) {
		System.out.println("Introduce la cantidad de Kb a convertir a Mb");
		Scanner scan = new Scanner(System.in);
		double kb = scan.nextDouble();
		double mb = kb / 1000;
		System.out.println("Son " + mb);
	}
}