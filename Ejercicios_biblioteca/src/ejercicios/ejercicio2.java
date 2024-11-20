package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String str = scan.nextLine();
		int len = str.length();
		int i = len - 3;
		boolean cant = i > 0;
		String substr;
		substr = cant ? str.substring(i, len) : "La frase no tiene tantos caracteres";
		System.out.println(substr);
	}
}