package ejercicios;

import java.util.Scanner;

public class ejercicio11
{
	private static void ft_piso(int piso)
	{
		int i;
		if (piso == 0)
			System.out.println("Ya estas en el piso que quieres");
		for (i = -1; piso < 0; piso++)
		{
			System.out.println("Baja al piso " + i);
			i--;
		}
		for (i = 1; piso > 0; piso--)
		{
			System.out.println("Sube al piso " + i);
			i++;
		}
		return ;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa al pisod al que quieres subir");
		int piso = scan.nextInt();
		ft_piso(piso);
		return ;
	}
}