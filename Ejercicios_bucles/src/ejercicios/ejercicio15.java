package ejercicios;

import java.util.Scanner;

public class ejercicio15
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a;
		int t;
		String str;
		
		a = scan.nextInt();
		t = a;
		str = "";
		while (a != 0)
		{
			str = str + "*";
			a--;
			if (a == 0)
			{
				System.out.println(str);
				a = t - 1;
				t--;
				str = "";
			}
		}
	}
}