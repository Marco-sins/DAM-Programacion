package ejercicios;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una letra: ");
		String str = scan.nextLine();
		char c = str.charAt(0);
		boolean check = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
		String msg = check ? "El carácter es una vocal" : "El carácter no es una vocal";
		System.out.println(msg);
	}
}