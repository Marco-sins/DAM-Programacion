package ejercicios;

import java.util.Scanner;

public class ejercicio3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		int num2;
		
		num = (int) (Math.random() * 100) + 1;
		num2 = 0;
		while (num != num2 && num2 != -1)
		{
			System.out.println("Introduce un numero del 1 al 100" + " (-1 para terminar)");
			num2 = scan.nextInt();
			if (num2 == num)
				System.out.println("Correcto");
			else if (num2 == -1)
				System.out.println("Cagón");
			else if (num2 < num)
				System.out.println("Mayor");
			else if (num2 > num)
				System.out.println("Menor");
		}
		System.out.println(num);
	}
}