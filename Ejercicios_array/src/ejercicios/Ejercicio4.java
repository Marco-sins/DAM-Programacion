package ejercicios;

import java.util.Scanner;

public class Ejercicio4
{
	private static void ft_juego(boolean map[][], int x_jugador, int y_jugador, int x_salida, int y_salida)
	{
		int x;
		int y;
		
		if (map[y_jugador][x_jugador] && map[y_salida][x_salida])
		{
			x = x_jugador;
			y = y_jugador;
			while (x != x_salida && y != y_salida)
			{
				if (map[y][x + 1])
					x++;
				else if (map[y + 1][x])
					y++;
				else if (x > 0)
				{
					if (map[y][x - 1])
						x--;
				}
				else if (y > 0)
				{
					if (map[y - 1][x])
						y--;
				}
				else 
				{
					System.out.println("No se puede llegar");
					return;
				}
			}
			if (x == x_salida && y == y_salida)
				System.out.println("Se puede llegar");
		}
	}
	
	
	public static void main(String[] args)
	{
		boolean map[][] = {
				{true, false, false, false, true},
				{true, false, false, true, false},
				{true, true, false, true, false},
				{false, true, false, true, false},
				{false, true, true, true, false}
		};
		ft_juego (map, 0, 0, 4, 0);
	}
}