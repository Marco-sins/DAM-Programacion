package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String str = scan.nextLine();
		str = str.toUpperCase();
		System.out.println(str);
	}
}