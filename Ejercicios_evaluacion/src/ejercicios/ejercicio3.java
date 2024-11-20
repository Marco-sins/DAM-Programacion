/*Modifica la actividad anterior para que, indicando dos numeros n y m, diga que cantidad gay que 
sumarle a n para que sea multiplo de m*/

package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		int n = scan.nextInt();
		int m = scan.nextInt();
		boolean diff = n == m ? true : false;
		int i = diff ? 0 : (m -(n % m));
		System.out.println("Para que el primer número sea multiplo del segundo falta: " + i);
	}
}