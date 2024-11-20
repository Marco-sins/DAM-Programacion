package ejercicios;

import java.util.Random;

public class ejercicio9 {
	public static void main(String[] args) {
		double num = Math.random();
		System.out.println("El número random es: " + num);
		boolean media = num < 0.5;
		String str = media ? "El número está más cerca de 0" : "El número está más cerca de 1";
		System.out.println(str);
	}
}