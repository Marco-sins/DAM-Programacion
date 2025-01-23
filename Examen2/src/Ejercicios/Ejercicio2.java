package Ejercicios;

public class Ejercicio2
{
	public static boolean validarSudoku(int[][] array)
	{
		int i;
		int j;
		int[] ar;
		
		for (j = 0; j < array.length; j++)
		{
			ar = new int[9];
			for (i = 0; i < array[j].length; i++)				//recorro el doble array
			{
				for (int k = 0; k < ar.length; k++)
				{
					if (ar[k] == array[j][i] || !(array[j][i] >= 0 && array[j][i] <= 9))				//otro bucle para ver si el numero ya esta con un array auxiliar
						return (false);
				}
				ar[i] = array[j][i];
			}
		}
		return (true);
	}
	
	public static void main(String[] args)
	{
		int[][] array = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
		             	{6, 7, 2, 1, 9, 5, 3, 4, 8},
		             	{1, 9, 8, 3, 4, 2, 5, 6, 7},
		             	{1, 2, 3, 4, 5, 6, 7, 8, 9}};
		System.out.println(validarSudoku(array));		
	}
}