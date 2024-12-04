package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5
{
	private static int[] suma(int t[], int numElementos)
	{
		int i;
		int n;
		int result[];
		
		i = 0;
		result = new int[0];
		while (i + 2 < numElementos)
		{
			result = Arrays.copyOf(result,  i + 1);
			n = t[i] + t[i + 1] + t[i + 2];
			result[i] = n;
			i++;
		}
		return (result);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int t[];
		int i;
		int n;
		
		t = new int[0];
		System.out.println("Ingrese un numero entero o -1 para terminar");
		n = scan.nextInt();
		i = 0;
		while (n != -1)
		{
			t = Arrays.copyOf(t,  i + 1);
			t[i] = n;
			i++;
			System.out.println("Ingrese un numero entero o -1 para terminar");
			n = scan.nextInt();
		}
		int result[] = suma(t, i);
		System.out.println(Arrays.toString(result));
	}
}