package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		final float iva = 0.21F;
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Qué precio tiene el producto?");
		float precio = scan.nextFloat();
		float total = (precio * iva) + precio;
		System.out.println("El precio total del articulo es: " + total);
	}
}