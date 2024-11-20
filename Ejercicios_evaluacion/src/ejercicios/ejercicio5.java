/*Diseña una aplicacion que solicite al usuario que introduzca una cantidad de segundos. 
 * La aplicacion debe mostrar cuantas horas, minutos y segundos hay en el numero de segundos introducidos por el usuario*/

package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de segundos");
		int s = scan.nextInt();
		int h = s / 3600;
		int min = (s - (h * 3600)) / 60;
		int seg = s - ((h * 3600) + (min * 60));
		System.out.println("Hay " + h + " horas, " + min + " minutos, " + seg + " segundos");
	}
}