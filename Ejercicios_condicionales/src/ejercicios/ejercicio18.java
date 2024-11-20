package ejercicios;

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese x1: ");
		float x1 = scan.nextFloat();
		System.out.println("Ingrese x2: ");
		float x2 = scan.nextFloat();
		System.out.println("Ingrese y1: ");
		float y1 = scan.nextFloat();
		System.out.println("Ingrese y2: ");
		float y2 = scan.nextFloat();
		System.out.println("Ingrese r1: ");
		float r1 = scan.nextFloat();
		System.out.println("Ingrese r2: ");
		float r2 = scan.nextFloat();
		float distancia = (float) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		if (distancia < 0)
			System.out.println("Error");
		else
			distancia = (float) Math.sqrt(distancia);
		if ((r1 + r2) < distancia)
			System.out.println("Son exteriores");
		else if ((r1 + r2) == distancia)
			System.out.println("Son tangentes exteriores");
		else if ((r1 + r2) > distancia && distancia > Math.abs(r1 - r2))
			System.out.println("Son secantes");
		else if (0 < distancia && distancia < Math.abs(r1 - r2))
			System.out.println("Son interiores");
		else if ((r1 - r2) == distancia)
			System.out.println("Son tangentes interiores");
		else if (distancia == 0)
			System.out.println("Son concentricas");
	}
}