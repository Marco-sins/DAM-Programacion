package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la base imponible");
		float base = scan.nextFloat();
		System.out.println("Introduce el IVA impuesto");
		float iva = scan.nextFloat();
		float imp_iva = (iva * 100) / base;
		float total = base + imp_iva;
		System.out.println("Su coste total es: " + total);
	}
}