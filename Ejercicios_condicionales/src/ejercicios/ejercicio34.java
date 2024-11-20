package ejercicios;

import java.util.Scanner;

public class ejercicio34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int honda = 3500;
		int suzuki = 4000;
		int yamaha = 5000;
		int otras = 3000;
		double result = 0;
		System.out.println("Escribe la marca de moto: ");
		String marca = scan.next();
		if (marca.equals("honda"))
		{
			result = honda - (honda * 0.05);
			System.out.print("El precio total a pagar es de: " + result);
		}
		else if (marca.equals("suzuki"))
		{
			result = suzuki - (suzuki * 0.1);
			System.out.print("El precio total a pagar es de: " + result);
		}
		else if (marca.equals("yamaha"))
		{
			result = yamaha - (yamaha * 0.08);
			System.out.print("El precio total a pagar es de: " + result);
		}
		else if (marca.equals("otras"))
		{
			result = otras - (otras * 0.05);
			System.out.print("El precio total a pagar es de: " + result);
		}
		else
			System.out.println("Error en el ingreso de marca.");
	}
}