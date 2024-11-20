package ejercicios;

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {
		System.out.println("Introduce los dos números");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		double division = num1 / num2;
		System.out.println("La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicación es: " + multiplicacion + "\nLa division es: " + division);
	}
}