package ejercicios;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la hora");
		int hora = scan.nextInt();
		System.out.println("Introduce los minutos: ");
		int minutos = scan.nextInt();
		int hora_fal = 0;
		int min_fal = 0;
		if (minutos != 0)
			hora_fal = 23 - hora;
		else
			hora_fal = 24 - hora;
		if (minutos != 0)
			min_fal = 60 - minutos;
		int min_to_sec = min_fal * 60;
		int hor_to_sec = hora_fal * 3600;
		int total = min_to_sec + hor_to_sec;
		if (hora < 0 || hora > 24 || minutos < 0 || minutos > 60)
			System.out.println("Error");
		else
			System.out.println("Faltan " + total + " segundos para llegar a media noche");
	}
}