package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int i = scan.nextInt();
		System.out.println("Introduce un segundo número");
		int j = scan.nextInt();
		System.out.println("Introduce un tercer número");
		int k = scan.nextInt();
		boolean imayo = i > k  ? true : false;
		boolean jmayo = j > i ? true : false;
		boolean kmayo = k > j ? true : false;
		String msg = imayo ? (jmayo ? "El segundo número es el más grande" : "El primer número es el más grande") : kmayo ? "El tercer número es el más grande" : "El segundo número es el más grande";
		System.out.println(msg);
	}
}