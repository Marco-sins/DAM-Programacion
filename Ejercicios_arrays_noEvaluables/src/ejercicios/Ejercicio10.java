package ejercicios;

import java.util.Arrays;

public class Ejercicio10
{
	public static void main(String[] args)
	{
		int i;
		int j;
		int arr[] = new int [20];
		int arr2[] = new int [20];
		
		i = 0;
		while (i < 20)
		{
			arr[i] = (int) ((Math.random() * 100) + 1);
			i++;
		}
		i = 0;
		j = 0;
		while (i < 20)
		{
			if (arr[i] % 2 == 0)
			{
				arr2[j] = arr[i];
				j++;
			}
			i++;
		}
		i = 0;
		while (i < 20)
		{
			if (arr[i] % 2 != 0)
			{
				arr2[j] = arr[i];
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}