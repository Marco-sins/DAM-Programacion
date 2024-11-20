package ejercicios;

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		double precio_manzana = 2.35;
		double precio_pera = 1.95;
		System.out.println("Indique la cantidad de manzanas ha vendido en el semestre  y luego la cantidad de peras");
		Scanner scan = new Scanner(System.in);
		double man = scan.nextDouble();
		double peras = scan.nextDouble();
		double result = ((man * 2) * precio_manzana) + ((peras * 2) * precio_pera);
		System.out.println("La cantidad que ha generado son " + result + " euros");
	}
}