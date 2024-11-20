package ejercicios;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un carácter: ");
		String str = scan.nextLine();
		char c = str.charAt(0);
		boolean check = c <= '9' && c >= '0';
		String msg = check ? "El carácter es un número" : "El carácter no es un número";
		System.out.println(msg);
	}
}