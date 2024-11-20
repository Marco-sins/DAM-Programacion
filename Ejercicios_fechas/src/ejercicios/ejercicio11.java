package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un carácter: ");
		String str = scan.nextLine();
		char c = str.charAt(0);
		boolean check = (c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A');
		String msg = check ? "El carácter es una letra alfabética" : "El carácter no es una letra alfabética";
		System.out.println(msg);
	}
}