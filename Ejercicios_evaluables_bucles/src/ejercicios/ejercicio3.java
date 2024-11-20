package ejercicios;

import java.util.Scanner;

public class ejercicio3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int a = scan.nextInt();
		System.out.println("Introduce otro numero");
		int b = scan.nextInt();
		if (a > 0 && b > 0)
		{
			for (int div = a; div > 0; div--)			//Igualo la variable que voy a utilizar para averiguar el MCD y lo igualo a uno de los numeros que me pasa. 
			{											//Una vez hecho lo unico que queda es ir dividiendo el numero entre los dos,			
				if (a % div == 0 && b % div == 0)		//En caso de que el resto de las dos divisones da 0 es porque se ha encontrado el MCD
				{										//En caso contrario, va restando el divisor para llegar hasta 1 mientras comprueba con todos los numeros si es el MCD
					System.out.println("El maximo comun divisor de ambos numeros es: " + div);
					break ;								//Una vez encontrado rompe con el bucle 
				}
			}
		}
		else											//En caso de que alguno de los dos numeros sea negativo muestra error
			System.out.println("Error");
	}
}