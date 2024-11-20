package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la comida que se compra diariamente en kilos");
		int comidantaria = scan.nextInt();
		System.out.println("Ingrese el número de animales que hay que alimentar");
		int numanimales = scan.nextInt();
		System.out.println("¿Cuánto come diariamente cada animal en kilos?");
		int kilosporAnimal = scan.nextInt();
		if (comidantaria == 0 || numanimales == 0 || kilosporAnimal == 0)
			System.out.println("Error en el ingreso de datos");
		else if (comidantaria < (kilosporAnimal * numanimales))
			System.out.println("No hay suficiente comida");
		else if (comidantaria >= kilosporAnimal * numanimales)
			System.out.println("La comida se debe dividir en raciones de " + kilosporAnimal * (comidantaria / (kilosporAnimal * numanimales)));
	}
}