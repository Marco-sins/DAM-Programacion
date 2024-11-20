package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número cualquiera: ");
		double num = scan.nextDouble();
		num = Math.abs(num);
		System.out.println("El valor absoluto del número es: " + num);
	}
}