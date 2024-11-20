package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce los lados del triángulo");
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		boolean equal3 = i ==j && j == k ? true : false;
		boolean equal2 = i == j || j == k || i == k ? true : false;
		String msg = equal3 ? "El triángulo es equilátero" : equal2 ? "El triángulo es isósceles" : "El triángulo es escaleno";
		System.out.println(msg);
	}
}