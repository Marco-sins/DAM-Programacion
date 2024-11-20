package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int a = scan.nextInt();
		System.out.println("Introduce un segundo número");
		int b = scan.nextInt();
		System.out.println("Introduce uno de estos operadores (+, -, *, /)");
		String ope = scan.next();
		boolean pos = ope.equals("+") ? true : false;
		boolean neg = ope.equals("-") ? true : false;
		boolean mul = ope.equals("*") ? true : false;
		boolean div = ope.equals("/") ? true : false;
		double total = pos ? total = a + b : neg ? total = a - b : mul ? total = a * b : div ? total = a / b : 0;
		System.out.println(total);
	}
}