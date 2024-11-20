package ejercicios;

import java.util.Scanner;

public class ejercicio32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe su nombre: ");
		String name = scan.nextLine();
		System.out.println("Ingrese la cantidad de ruedas compradas");
		int cant = scan.nextInt();
		int total = 0;
		if (cant < 12)
		{
			total = cant * 300;
			System.out.println(name + " ,debes pagar: " + total);
		}
		else
		{
			total = cant * 280;
			System.out.println(name + " ,debes pagar: " + total);
		}
	}
}