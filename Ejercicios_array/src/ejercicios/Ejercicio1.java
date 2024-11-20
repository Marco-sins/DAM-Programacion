package ejercicios;

import java.util.Arrays;

public class Ejercicio1
{
	private static int[] buscarTodos(int t[], int clave)
	{
		int i;
		int j;
		int ney[] = new int[0];
		
		j = 0;
		for (i = 0; i < t.length; i++)
		{
			if (t[i] == clave)
			{
				ney = Arrays.copyOf(ney, j + 1);
				ney[j] = i;
				j++;
			}
		}
		return (ney);
	}
	
	public static void main(String[] args)
	{
		int t[] = {1, 2, 8, 2, 9, 2, 2, 2};
		int clave = 2;
		
		System.out.println(Arrays.toString(buscarTodos(t, clave)));
		return ;
	}
	
}