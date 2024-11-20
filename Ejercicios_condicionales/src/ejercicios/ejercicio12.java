package ejercicios;

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un caracter para pintar la piramide: ");
		String aux = scan.next();
		char c = aux.charAt(0);
		System.out.println("Donde quieres que este apuntando la piramide");
		String direction = scan.next();
		if (direction.equals("arriba"))
		{
			System.out.println(" " + " " + c + " " + " ");
			System.out.println(" " + c + c + c + " ");
			System.out.println(c + "" + c + "" + c + "" + c + "" + c);
		}
		if (direction.equals("abajo"))
		{
			System.out.println(c + "" + c + "" + c + "" + c + "" + c);			
			System.out.println(" " + c + "" + c + "" + c + " ");
			System.out.println(" " + " " + c + " " + " ");

		}
		if (direction.equals("derecha"))
		{
			System.out.println(c + " " + " ");
			System.out.println(c + "" + c + " ");
			System.out.println(c + "" + c + "" + c);
			System.out.println(c + "" + c + " ");
			System.out.println(c + " " + " ");

		}
		if (direction.equals("izquierda"))
		{
			System.out.println(" " + " " + c);
			System.out.println(" " + c + "" + c);
			System.out.println(c + "" + c + "" + c);
			System.out.println(" " + c + "" + c);
			System.out.println(" " + " " + c);
		}
	}
}