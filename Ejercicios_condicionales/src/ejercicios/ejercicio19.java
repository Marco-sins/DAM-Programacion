package ejercicios;

import java.util.Scanner;

public class ejercicio19 
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un lado del triangulo: ");
		num1 = scan.nextInt();
		System.out.println("Ingrese otro lado del triangulo: ");
		num2 = scan.nextInt();
		System.out.println("Ingrese otro lado del triangulo: ");
		num3 = scan.nextInt();
		if (num1 == num2 && num1 == num3)
			System.out.println("Es un triangulo equilatero");
		else if (num1 == num2 || num1 == num3 || num2 == num3)
			System.out.println("Es un triangulo isosceles");
		else
			System.out.println("Es un triangulo escaleno");
	}
}