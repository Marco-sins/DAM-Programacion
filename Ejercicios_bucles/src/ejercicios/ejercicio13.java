package ejercicios;

import java.util.Scanner;

public class ejercicio13
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int nota;
		int suspenso;
		int condicionados;
		int aprobados;
		int i;
		
		suspenso = 0;
		condicionados = 0;
		aprobados = 0;
		for (i = 0; i < 6; i++)
		{
			System.out.println("Introduce la nota");
			nota = scan.nextInt();
			if (nota < 0 || nota > 10)
			{
				System.out.println("Error");
				break;
			}
			else if (nota < 4)
				suspenso++;
			else if (nota == 4)
				condicionados++;
			else if (nota >= 5)
				aprobados++;
		}
		System.out.println("Hay " + aprobados + " aprobados");
		System.out.println("Hay " + condicionados + " condicionados");
		System.out.println("Hay " + suspenso + " suspensos");
	}
}