package ejercicios;

import java.util.Scanner;

public class ejercicio8{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int num1 = scan.nextInt();
		System.out.println("Ingrese otro número");
		int num2 = scan.nextInt();
		int total = (int) Math.pow(num1, num2);
		System.out.println("El número exponenciado es: " + total);
	}
}