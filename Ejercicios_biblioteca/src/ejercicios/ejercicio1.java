package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String str = scan.nextLine();
		int i = 2;
		int len = str.length();		
		boolean cant = i <= len;
		String substr;
		substr = cant ? str.substring(0, i) : "La frase no tiene tantos caracteres";
		System.out.println(substr);
	}
}