package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Has comprado la entrada?");
		String entrada = scan.next();
		System.out.println("¿Cuántos años tienes?");
		int mayor = scan.nextInt();
		boolean edad = mayor >= 18 ? true : false;
		boolean acceso = entrada.equals("si") || entrada.equals("Si") ? true : false; 
		String msg = edad ? acceso ? "Puedes entrar a ver la película" : "No tienes acceso" : "No tienes acceso";
		System.out.println(msg);
	}
}