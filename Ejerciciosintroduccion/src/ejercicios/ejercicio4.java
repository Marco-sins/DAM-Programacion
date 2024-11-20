package ejercicios;

import java.util.Scanner;

	public class ejercicio4 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingrese la cantidad de euros para convertir en pesetas: ");
			float euro = scan.nextFloat();
			double valor_peseta = 166.386;
			final float conversion = euro * (float) valor_peseta;
			System.out.println("Su cantidad en pesetas es: " + conversion);
		}
}
	