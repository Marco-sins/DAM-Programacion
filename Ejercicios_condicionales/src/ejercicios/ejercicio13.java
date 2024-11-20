package ejercicios;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num = scan.nextInt();
		int total = num % 10;
		System.out.println("La última cifra del número es " + total);
	}
}