package ejercicios;

import java.util.Scanner;

public class ejercicio24 {
	public static void main(String[] args) {
		System.out.println("Introduce la cantidad de Mb a convertir a Kb");
		Scanner scan = new Scanner(System.in);
		double mb = scan.nextDouble();
		double kb = mb * 1000;
		System.out.println("Son " + kb);
	}
}