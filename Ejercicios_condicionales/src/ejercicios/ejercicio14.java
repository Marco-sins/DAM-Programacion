package ejercicios;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número de máximo 5 cifras: ");
		int num = scan.nextInt();
		if (num < 0)
			num *= -1;
		if(num < 10 && num > 0)
			System.out.println("La primera cifra del número es " + num);
		else
		{
			num /= 10;
			if(num < 10)
				System.out.println("La primera cifra del número es " + num);
			else
			{
				num /= 10;
				if(num < 10)
					System.out.println("La primera cifra del número es " + num);
				else
				{
					num /= 10;
					if(num < 10)
						System.out.println("La primera cifra del número es " + num);
					else
					{
						num /= 10;
						if(num < 10)
							System.out.println("La primera cifra del número es " + num);
						else
						{
							num /= 10;
							System.out.println("Error");
						}		
					}		
				}		
			}		
		}		
	}
}