package ejercicios;

import java.util.Scanner;

public class ejercicio15nuevo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean llueve;
		boolean tareas;
		boolean biblioteca;
		System.out.println("Dime si llueve");
		llueve = scan.nextBoolean();
		System.out.println("Dime si has acabado las tareas");
		tareas = scan.nextBoolean();
		System.out.println("Dime si tienes que ir a la biblioteca");
		biblioteca = scan.nextBoolean();
		boolean resultado = ((!llueve && !tareas) || biblioteca) ? true : false;
		System.out.println(resultado);
	}
}