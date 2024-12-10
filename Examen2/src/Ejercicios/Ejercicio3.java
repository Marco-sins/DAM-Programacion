package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3
{
	private static int[] ft_puntuacion(int[][] hoyos)			//calculo las puntuaciones y las devuelvo en un array
	{
		int i;
		int j;
		int[] total = new int[3];
		int total2 = 0;
		
		for (j = 1; j < 4; j++)
		{
			for (i = 0; i < 9; i++)
			{
				if (hoyos[0][i] == hoyos[j][i])
					total2 += 2;
				else if (hoyos[0][i] == hoyos[j][i] + 1)
					total2 += 3;
				else if (hoyos[0][i] == hoyos[j][i] + 2 || hoyos[0][i] == hoyos[j][i] + 3 || hoyos[0][i] == hoyos[j][i] + 4)
					total2 += 4;
				else if (hoyos[0][i] == hoyos[j][i] - 1)
					total2 += 1;
				else if (hoyos[0][i] <= hoyos[j][i] - 2)
					total2 += 0;
			}
			total[j - 1] = total2;
			total2 = 0;
		}
		return (total);
	}
	
	private static void ft_ganador(int[] puntuacion)									//digo el jugador que ha ganado
	{
		if (puntuacion[0] > puntuacion[1] && puntuacion[0] > puntuacion[2])
			System.out.println("El ganador es el jugador 1 con " + puntuacion[0] + " puntos");
		else if (puntuacion[1] > puntuacion[0] && puntuacion[1] > puntuacion[2])
			System.out.println("El ganador es el jugador 2 con " + puntuacion[1] + " puntos");
		else if (puntuacion[2] > puntuacion[0] && puntuacion[2] > puntuacion[1])
			System.out.println("El ganador es el jugador 3 con " + puntuacion[2] + " puntos");
	}
	
	private static int[][] ft_puntuacion_enlistada(int[][] hoyos)			//calculo las puntuaciones y las devuelvo en un array
	{
		int i;
		int j;
		int[][] total = new int[3][9];
		
		for (j = 1; j < 4; j++)
		{
			for (i = 0; i < 9; i++)
			{
				if (hoyos[0][i] == hoyos[j][i])
					total[j - 1][i] = 2;
				else if (hoyos[0][i] == hoyos[j][i] + 1)
					total[j -1][i] = 3;
				else if (hoyos[0][i] >= hoyos[j][i] + 2)
					total[j -1][i] = 4;
				else if (hoyos[0][i] == hoyos[j][i] - 1)
					total[j - 1][i] = 1;
				else if (hoyos[0][i] <= hoyos[j][i] - 2)
					total[j - 1][i] = 0;
			}
		}
		return (total);
	}
	
	private static void ft_order(int[][] hoyos, int[][] puntuacion)				//ordeno para mostrar los golpes ordenados
	{
		int[] order = new int[9];
		int[] order2 = new int[9];
		int i;
		int j;
		int k;
		int punt;
		
		for (j = 1; j < 4; j++)
		{
			k = 0;
			punt = 4;
			for (i = 0; k < 9; i++)
			{
				if (puntuacion[j - 1][i] == punt)
				{
					order2[k] = hoyos[j][i];
					order[k] = i + 1;
					k++;
				}
				if (i == 8)
				{ 
					i = 0;
					punt--;
				}
			}
			System.out.println("El jugador " + j + " con la puntuacion ordenada por hoyos " + Arrays.toString(order));
			System.out.println("El jugador " + j + " con la puntuacion ordenada con los puntos de cada hoyo " + Arrays.toString(order2));
			order = new int[9];
			order2 = new int[9];
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[][] hoyos = new int[4][9];
		int[] puntuacion = new int[3];
		int[][] hoyos_puntuados = new int[3][9];
		for (int i = 0; i < 9; i++)
		{
			hoyos[0][i] = (int) (Math.random() * 3) + 3;
		}
		System.out.println(Arrays.toString(hoyos[0]));
		for (int j = 1; j < 4; j++)
		{
			for (int i = 0; i < 9; i++)
			{
				hoyos[j][i] = (int) (Math.random() * 8) + 1;
			}
		}
		puntuacion = ft_puntuacion(hoyos);
		ft_ganador(puntuacion);
		hoyos_puntuados = ft_puntuacion_enlistada(hoyos);
		ft_order(hoyos, hoyos_puntuados);
		scan.close();
	}
}