package ejercicios;

import java.util.Scanner;

public class ejercicio4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero para calcular su raiz cuadrada");
		int num = scan.nextInt();
		int resto = 0;
		if (num >= 0)
		{
			for (int i = 1; i <= num; i++)										//Va iterando sobre todos los posibles casos y mirando si el numero al cuadrado es igual al numero ingresado
			{																	//En caso de que se pase coge el iterador anterior al cuadrado y se lo resta al numero ingresado
				if (num == Math.pow(i, 2))										//Para poder asi saber cual es la raiz cuadrada y el resto, la raiz siendo el iterador y el resto la resta.
				{
					System.out.println("La raiz cuadrada del numero es: " + i);
					break;
				}
				if (num < Math.pow(i, 2))
				{
					i--;
					resto = (int) (num - Math.pow(i, 2));
					System.out.println("La raiz cuadrada del numero es: " + i + " y con resto: " + resto);
					break;
				}
			}
			if (num == 0)														//En caso de que el numero sea 0, muestra 0
				System.out.println("La raiz cuadrada del numero es 0"); 
		}
		else																	//En caso de un numero negativo muestra error ya que no existe la raiz cuadrada de un negativo
			System.out.println("Error, no se puede calcular");
	}
}