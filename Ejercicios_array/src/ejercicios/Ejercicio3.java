package ejercicios;

import java.util.Scanner;

public class Ejercicio3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x;
		int x1;
		int y;
		int y1;
		int z;
		int z1;
		int n;
		double media_group;
		int ar[][][];
		
		ar = new int[2][5][4];
		
		z = 0;
		y = 0;
		while (z < 2)
		{
			y = 0;
			media_group = 0;
			while (y < 5)
			{
				x = 0;
				while (x < 3)
				{
					System.out.println("Introduce la nota del trimestre " + (x + 1) + " del " + (y + 1) + " alumno");
					ar[z][y][x] = scan.nextInt();
					if (ar[z][y][x] >= 0 && ar[z][y][x] <= 10)
						x++;
				}
				ar[z][y][x] = (ar[z][y][0] + ar[z][y][1] + ar[z][y][2]) / 3;
				media_group += ar[z][y][x];
				if (y != 0)
					media_group /= 2;
				y++;
			}
			System.out.println("La media total del grupo es: " + media_group);
			z++;
		}
		n = 0;
		while (true)
		{
			System.out.println("Ingresa 1 si quieres ver la media de un alumno o -1 si no quiere ver ninguna");
			n = scan.nextInt();
			if (n == -1)
				break;
			System.out.println("Ingresa del grupo que es, 1-" + z);
			z1 = scan.nextInt() - 1;
			if (!(z1 < 0 && z1 > z))
			{
				System.out.println("Ingresa en que posicion del grupo esta, 1-5");
				y1 = scan.nextInt() - 1;
				if (!(y1 < 0 && y1 > y))
					System.out.println("La media del alumno es: " + ar[z1][y1][3]);
				else
					System.out.println("Error al ingresar datos, vuelva a intentarlo");
			}
			else
				System.out.println("Error al ingresar datos, vuelva a intentarlo");
		}
	}
}