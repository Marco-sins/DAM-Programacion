package ejercicios;

import java.util.Scanner;

public class ejercicio22 {
	public static void main(String[] args) {
		int salario = 12;
		System.out.println("Introduce la cantidad de horas trabajadas");
		Scanner scan = new Scanner(System.in);
		double hora = scan.nextDouble();
		double dinero = salario * hora;
		double total = dinero * 5;
		System.out.println(total);
	}
}