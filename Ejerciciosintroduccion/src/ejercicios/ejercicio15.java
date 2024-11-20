package ejercicios;

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Pulse 1 si está lloviendo?");
		int lluvia = scan.nextInt();
		System.out.println("¿Pulse 1 si has terminado las tareas?");
		int tarea = scan.nextInt();
		System.out.println("¿Pulse 1 si tienes que ir a la biblioteca?");
		int biblio =  scan.nextInt();
		boolean salir = (((lluvia == 0) & (tarea == 1)) | (biblio == 1)) ? true : false;
		String msg = salir ? "Puedes salir" : "No puedes salir";
		System.out.println(msg);
	}
}