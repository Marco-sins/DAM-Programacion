package ejercicios;

import java.util.Scanner;

public class ejercicio16
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int password;
		int passworduser;
		int i;
		
		password = 1234;
		for (i = 4; i != 0; i--)
		{
			System.out.println("Introduce la contraseña");
			passworduser = scan.nextInt();
			if (passworduser == password)
			{
				System.out.println("La caja fuerte ha sido abierta satisfactoriamente");
				break;
			}
			else
				System.out.println("Lo siento, esa no es la combinación");
		}
	}
}