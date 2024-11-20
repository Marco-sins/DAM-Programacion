package ejercicios;

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
	System.out.println("Ingrese el radio de la circunferencia");
	Scanner scan = new Scanner(System.in);
	double radio = scan.nextDouble();
	final double pi = 3.14;
	double len = (radio * 2) * pi;
	double area = (radio * radio) * pi;
	System.out.println("La longitud de la circunferencia es de " + len + "\nEl área de la circunferencia es " + area);
	}
}