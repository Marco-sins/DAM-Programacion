package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String src;
		
		while (i < 10)
		{
			System.out.println("Introduce una palabra");
			src = scan.nextLine();
			list.add(src);
			i++;
		}
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
	}
}
