package ejercicios;

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args) {
		System.out.println("Introduce la nota del primer examen");
		Scanner scan = new Scanner(System.in);
		float primer = scan.nextFloat();
		System.out.println("¿Cuánta nota quieres sacar en el trimestre?");
		float trimestre = scan.nextFloat();
		primer = ((primer * 40) / 100);
		trimestre += trimestre;
		float restante = trimestre - primer;
		float segundo = (restante * 60) / 100;
		System.out.println("En el segundo examen tendrá que sacar un " + segundo);
	}
}