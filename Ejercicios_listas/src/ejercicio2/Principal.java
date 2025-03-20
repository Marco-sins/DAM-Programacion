package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal{

	public static List<Integer> ft_crear_lista(List<Integer> lista)
	{
		List<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> it = lista.iterator();
		int i = 0;
		
		while(it.hasNext())
		{
			int src = it.next();
			if (src % 5 == 0)
			{
				list.add(i, src);
				i++;
			}
		}
		return (list);
	}
	
	public static List<Integer> ft_retocar_lista(List<Integer> lista)
	{
		List<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> it = lista.iterator();
		int i = 0;
		
		while(it.hasNext()) 
		{
			int src = it.next();
			if (!(src % 2 == 0 || src % 5 == 0))
			{
				list.add(i, src);
				i++;
			}
		}
		
		return (list);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número enteros mayores o igual a 0");
		int num = sc.nextInt();
		List<Integer> listaNumeros = new ArrayList<Integer>();
		while (num >= 0) {
			listaNumeros.add(num);
			System.out.println("Introduce número enteros mayores o igual a 0");
			num = sc.nextInt();

		}
		System.out.println("Lista de números:" + listaNumeros.toString());
		List<Integer> mul_5 = ft_crear_lista(listaNumeros);
		System.out.println("Lista de números multiplos de 5:" + mul_5.toString());
		listaNumeros = ft_retocar_lista(listaNumeros);
		System.out.println("Lista de números sin los multiplos de 2 y 5:" + listaNumeros.toString());

	}

}