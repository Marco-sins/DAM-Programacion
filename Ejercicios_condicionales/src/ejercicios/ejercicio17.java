package ejercicios;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num = scan.nextInt();
		System.out.println("Ingrese el exponente: ");
		int expo = scan.nextInt();
		double total = 0;
		if (expo == 0)
			total = 1;
		if (expo < 0)
			total = Math.pow(num, expo);
		if (expo > 0)
			total = (double) Math.pow(num, expo);
		System.out.println("El resultado es: " + total);
	}
}