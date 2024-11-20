package ejercicios;

import java.util.Scanner;;

public class ejercicio20 {
	public static void main(String[] args) {
		System.out.println("Introduce la altura del triángulo");
		Scanner scan = new Scanner(System.in);
		double altura = scan.nextDouble();
		System.out.println("Introduce el ancho del triángulo");
		double ancho = scan.nextDouble();
		double area = (ancho * altura) / 2;
		System.out.println(area);
	}
}