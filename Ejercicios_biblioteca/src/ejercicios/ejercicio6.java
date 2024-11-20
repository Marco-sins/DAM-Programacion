package ejercicios;

import java.util.Random;

public class ejercicio6 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 6) + 1;
		System.out.println("El primer número es: " + num1);
		int num2 = (int) (Math.random() * 6) + 1;
		System.out.println("El segundo número es: " + num2);
		int num3 = (int) (Math.random() * 6) + 1;
		System.out.println("El tercer número es: " + num3);
		int total = num1 + num2 + num3;
		System.out.println("La suma de los tres números es: " + total);
	}
}