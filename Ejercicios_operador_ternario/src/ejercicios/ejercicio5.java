package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int i = scan.nextInt();
		boolean mult = i % 2 == 0 && i % 3 == 0 ? true : false;
		boolean mult1 = i % 2 == 0 ? true : false;
		boolean mult3 =  i % 3 == 0 ? true : false;
		String msg = mult ? "El número es múltiplo de 2 y de 3" : mult1 ? "Es múltiplo de 2 pero no de 3" : mult3 ? "Es múltiplo de 3 pero no de 2" : "El número no es múltiplo de 2 y de 3";
		System.out.println(msg);
	}
}