package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String str = scan.nextLine();
		System.out.println("Ingrese la cantidad de caracteres que quiere que tenga la substring");
		int i = scan.nextInt();
		int len = str.length();		
		boolean cant = i <= len;
		String substr;
		substr = cant ? str.substring(0, i) : "La frase no tiene tantos caracteres";
		System.out.println(substr);
	}
}