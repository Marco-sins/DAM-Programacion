package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		System.out.println("Ingrese su edad: ");
		Scanner scan = new Scanner(System.in);
		int edad = scan.nextInt();
		edad++;
		System.out.println("Su edad el próximo año será: " + edad);
	}
}