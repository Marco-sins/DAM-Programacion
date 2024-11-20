package ejercicios;

import java.util.Scanner;

public class ejercicio31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe su nombre: ");
		String name = scan.nextLine();
		System.out.println("Ingrese la cantidad de articulos comprados");
		int cant = scan.nextInt();
		if (cant < 5)
			System.out.println(name + " ,debes pagar en efectivo");
		if (cant >= 5 && cant <= 12)
			System.out.println(name + " ,debes pagar con tarjeta");
		if (cant > 12)
			System.out.println(name + " ,debes pagar con cheque");
	}
}