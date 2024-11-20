package ejercicios;

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un carácter: ");
		String str = scan.nextLine();
		char c = str.charAt(0);
		System.out.println("Ingrese otro carácter: ");
		String str1 = scan.nextLine();
		char c1 = str1.charAt(0);
		boolean check = (c == c1) || ((c - 32) == c1) || ((c + 32) == c1);
		String msg = check ? "Los dos caracteres son iguales" : "Los caracteres no son iguales";
		System.out.println(msg);
	}
}