package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		System.out.println("Ingrese la cantidad de pesetas a convertir: ");
		Scanner scan = new Scanner(System.in);
		float peseta = scan.nextFloat();
		double diff = 166.386;
		final float conversion = peseta / (float) diff;
		System.out.println("Su cantidad en euros es: " + conversion);
	}
}