/*Escribe un programa que tome como entrada un numero entero e indique que cantidad hay que 
 * sumarle para que el resultado sea multiplo de 7*/

package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num = scan.nextInt();
		boolean diff = num == 7 ? true : false;
		int i = diff ? num : (7 - (num % 7));
		String msg = diff ? "Su número es multiplo de 7, su número es: " : "Para llegar a ser multiplo de 7 falta: ";
		System.out.println(msg + i);
	}
}