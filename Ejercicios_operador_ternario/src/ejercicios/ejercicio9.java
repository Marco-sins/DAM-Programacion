package ejercicios;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = scan.nextInt();
		boolean infante = edad < 5 ? true : false;
		boolean niño = edad >= 5 && edad <= 12 ? true : false;
		boolean adoles = edad >= 13 && edad <= 17 ? true : false;
		String msg = infante ? "Es un infante" : niño ? "Es un niño" : adoles ? "Es un adolescente" : "Es un adulto";
		System.out.println(msg);
	}
}