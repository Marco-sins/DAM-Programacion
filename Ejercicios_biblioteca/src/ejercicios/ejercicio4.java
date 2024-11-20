package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String str = scan.nextLine();
		System.out.println("Ingrese el caracter de reemplazo: ");
		String s = scan.nextLine();
		char c = s.charAt(0);
		str = str.replace(' ', c);
		System.out.println(str);
	}
}