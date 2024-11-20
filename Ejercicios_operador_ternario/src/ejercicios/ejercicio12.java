package ejercicios;

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu puntuacion");
		int i = scan.nextInt();
		boolean error = i >= 0 && i <= 100 ? true : false;
		boolean a = i >= 90 ? true : false;
		boolean b = i >= 80 && i <= 89 ? true : false;
		boolean c = i >= 70 && i <= 79 ? true : false;
		boolean d = i >= 60 && i <= 69 ? true : false;
		String nota = error ? a ? "A" : b ? "B" : c ? "C" : d ? "D" : "F" : "Error";
		System.out.println(nota);
	}
}