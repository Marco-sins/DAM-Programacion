package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce las 3 notas: ");
		int nota1 = scan.nextInt();
		int nota2 = scan.nextInt();
		int nota3 = scan.nextInt();
		int total = (nota1 + nota2 + nota3) / 3;		
		System.out.println("La cantidad ganada esta semana es: " + total);
	}
}