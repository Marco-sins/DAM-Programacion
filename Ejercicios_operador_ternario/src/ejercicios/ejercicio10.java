package ejercicios;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int i = scan.nextInt();
		boolean rango = i > 0 && i < 100 ? true : false;
		boolean parimpar = i % 2 == 0 ? true : false;
		String msg = rango ? (parimpar ? "El número es par" : "El número es impar") : "Error";
		System.out.println(msg);
	}
}