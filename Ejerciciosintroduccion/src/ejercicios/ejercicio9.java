package ejercicios;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		System.out.println("Ingrese el año actual y luego su año de nacimiento: ");
		Scanner scan = new Scanner(System.in);
		int año = scan.nextInt();
		int nacimiento = scan.nextInt();
		int edad = año - nacimiento;
		System.out.println("Su edad es: " + edad);
	}
}