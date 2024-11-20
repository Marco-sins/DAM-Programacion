package ejercicios;

import java.util.Scanner;

public class ejercicio12
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int nota;
		int i;
		int suspenso;
		
		suspenso = 0;
		for (i = 0; i < 5; i++)
		{
			System.out.println("Introduce la nota");
			nota = scan.nextInt();
			if (nota < 5)
				suspenso++;
		}
		if (suspenso != 0)
			System.out.println("Hay " + suspenso + " suspensos");
		else
			System.out.println("No hay ningún suspenso");
	}
}