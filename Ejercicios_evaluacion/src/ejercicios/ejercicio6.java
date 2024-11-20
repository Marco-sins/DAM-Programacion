/*Solicita al usuario tres distancias:
 * -La primera, medida en milimetros.
 * -La segunda, medida en centimetros.
 * -La última, medida en metros.
 * Diseña un programa que muestre la suma de las tres longitudes introducidas(medidas en centimetros)*/

package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la primera medida en milimetros.");
		float mili = scan.nextFloat();
		System.out.println("Introduce la segunda medida en centimetros.");
		float centi = scan.nextFloat();
		System.out.println("Introduce la tercera medida en metros.");
		float metros = scan.nextFloat();
		float suma = (mili / 10) + centi + (metros * 100);
		System.out.println("La distancia total en centimetros es: " + suma);
	}
}