package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int i = scan.nextInt();
		System.out.println("Introduce un segundo número");
		int j = scan.nextInt();
		boolean equal = i == j ? true : false;
		boolean diff = i < j ? true : false;
		String msg = equal ? "Los dos números son iguales" : diff ? "El segundo número es más grande que el primero" : "El primer número es más grande que el segundo";
		System.out.println(msg);
	}
}