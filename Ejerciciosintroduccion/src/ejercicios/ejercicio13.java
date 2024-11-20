package ejercicios;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		System.out.println("¿Ingrese su edad?");
		Scanner scan = new Scanner(System.in);
		int edad = scan.nextInt();
		boolean mayor = edad >= 18 ? true : false;
		String mensaje = mayor ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mensaje);
	}
}