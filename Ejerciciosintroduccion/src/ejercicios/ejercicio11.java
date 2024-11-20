package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");
		int num1 = scan.nextInt();
		System.out.println("Ingrese el segundo número: ");
		int num2 = scan.nextInt();
		double media = (num1 + num2) / 2;
		System.out.println("Su media aritmetica es " + media);
	}
}