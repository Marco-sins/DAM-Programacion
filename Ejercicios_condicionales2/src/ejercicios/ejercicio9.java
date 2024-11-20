package ejercicios;

import java.util.Scanner;

public class ejercicio9
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int result;
		System.out.println("¿Cuánto es 7 * 3");
		result = scan.nextInt();
		if (result == 21)
			i++;
		System.out.println("¿Cuánto es 324 + 5421");
		result = scan.nextInt();
		if (result == 5745)
			i++;
		System.out.println("¿Cuánto es 45 / 5");
		result = scan.nextInt();
		if (result == 9)
			i++;
		System.out.println("¿Cuánto es 51 - 57");
		result = scan.nextInt();
		if (result == -6)
			i++;
		System.out.println("¿Cuánto es 7²");
		result = scan.nextInt();
		if (result == 49)
			i++;
		System.out.println("¿Cuánto es la raiz cuadrada de 169");
		result = scan.nextInt();
		if (result == 13)
			i++;
		System.out.println("¿Cuánto es 48 + 23 * 12");
		result = scan.nextInt();
		if (result == 324)
			i++;
		System.out.println("¿Cuánto es 15 * 4 * 23");
		result = scan.nextInt();
		if (result == 1380)
			i++;
		System.out.println("¿Cuánto es 45 * -6 + 6");
		result = scan.nextInt();
		if (result == -264)
			i++;
		System.out.println("¿Cuánto es (5 + 4) * 7");
		result = scan.nextInt();
		if (result == 63)
			i++;
		System.out.println("Su nota es: " + i);
	}
}