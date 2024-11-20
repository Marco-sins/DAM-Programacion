package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int i = scan.nextInt();
		boolean mult = i % 2 == 0 && i % 3 == 0 ? true : false;
		String msg = mult ? "El número es múltiplo de 2 y de 3" : "El número no es múltiplo de 2 y de 3";
		System.out.println(msg);
	}
}