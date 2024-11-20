package ejercicios;

import java.util.Scanner;

public class ejercicio23 {
	public static void main(String[] args) {
		final double pi = 3.14;
		System.out.println("Introduce la altura del cono");
		Scanner scan = new Scanner(System.in);
		double altura = scan.nextDouble();
		System.out.println("Introduce el radio del cono");
		double radio = scan.nextDouble();
		double volumen = (pi * (radio * radio) * altura) / 3;
		System.out.println("El volumen es " + volumen);
	}
}