package ejercicios;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int i = scan.nextInt();
		boolean negativo = i < 0 ? true : false;
		boolean positivo = i > 0 ? true : false;
		String msg = negativo ? "El número es negativo" : positivo ? "El número es positivo" : "El número es 0";
		System.out.println(msg);
	}
}