package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] argv)
	{
		List<Integer> num_aleatorio = new ArrayList<Integer>();
		int i = (int)(Math.random() * 11);
		int src;
		System.out.println(i);
		
		while (i < 20)
		{
			src = (int)(Math.random() * 101 - 1);
			num_aleatorio.add(src);
			i++;
		}
		
		Iterator<Integer> it = num_aleatorio.iterator();
		int media = 0;
		int suma = 0;
		int max = -1;
		int min = -1;
		i = 0;
		while(it.hasNext())
		{
			src = it.next();
			suma += src;
			i++;
			if (max == -1 || max < src)
				max = src;
			if (min == -1 || min > src)
				min = src;
		}
		
		media = suma / i;
		System.out.println(num_aleatorio.toString());
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Maximo: " + max);
		System.out.println("Minimo: " + min);
	}
}
