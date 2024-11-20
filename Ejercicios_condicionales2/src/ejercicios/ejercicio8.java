package ejercicios;

import java.util.Scanner;

public class ejercicio8
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cuandos grados tiene el angulo");
		double ang = scan.nextDouble();
		double radian = 0;
		if (ang < 0 || ang > 360)
			System.out.println("Error en el ingreso de datos");
		else
		{
			radian = ang * (3.14 / 180);
			System.out.println("Los radianes del angulo son: " + radian);
		}
	}
}