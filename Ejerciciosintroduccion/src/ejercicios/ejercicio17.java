package ejercicios;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese las notas del primer, segundo y tercer trimestre una tras otra.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int mediab = (num1 + num2 + num3) / 3;
		double mediad = (double) (num1 + num2 + num3) / 3; 
		System.out.println("Su nota del boletin es: " + mediab + "\nSu nota media es: " + mediad);
	}
}