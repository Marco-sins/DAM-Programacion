/*Dado el siguiente polinomio de segundo grado: y = ax² + bx + c, crea un programa que pida los coeficientes 
 * a, b y c, asi como el valor x, y calcula el valor correspondiente de y*/

package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el valor de x");
		int x = scan.nextInt();
		System.out.println("Introduce los valores a, b y c en este orden");
		int a = (x * x) * (scan.nextInt());
		int b = x * (scan.nextInt());
		int c = scan.nextInt();
		int y = a + b + c;
		System.out.println("El valor de y es: " + y);
	}
}