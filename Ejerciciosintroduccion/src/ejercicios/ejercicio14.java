package ejercicios;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		System.out.println("Ingrese un número");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean par = num % 2 == 0 ? true : false;
		String msg = par ? "El número es par" : "El número es impar";
		System.out.println(msg);
	}
}