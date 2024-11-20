package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Que dia es hoy? Introduzca el número del dia de la semana");
		String dia = scan.next();
		System.out.println("¿Que hora es?");
		int hora = scan.nextInt();
		boolean diario = dia.equals("sabado") || dia.equals("domingo") ? true : false;
		boolean horario = hora > 9 && hora < 15 ? true : false;
		String msg = diario ? "Puede descansar" : horario ? "Deberia estar trabajando" : "Puede descansar";
		System.out.println(msg);
	}
}