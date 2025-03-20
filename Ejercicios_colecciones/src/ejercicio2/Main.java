package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int src;
		
		while (i < 10)
		{
			System.out.println("Introduce un numero");
			src = scan.nextInt();
			list.add(src);
			i++;
		}
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
	}
}
