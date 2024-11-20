package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el dia de la semana: ");
		String dia = scan.nextLine();
		if (dia.equals("lunes"))
			System.out.println("A primera hora toca: Programación");
		else if (dia.equals("martes"))
			System.out.println("A primera hora toca: Sistemas informáticos");
		else if (dia.equals("miercoles"))
			System.out.println("A primera hora toca: Sistemas informáticos");
		else if (dia.equals("jueves"))
			System.out.println("A primera hora toca: Sistemas informáticos");
		else if (dia.equals("viernes"))
			System.out.println("A primera hora toca: Base de datos");
		else
			System.out.println("Hoy no hay clase");
	}
}