package Ejercicios;

import java.util.Scanner;

public class Ejercicio2
{
	public static void main(String[] args)
	{
		int num;
		long cuadrado;
		int len;
		int len2;
		boolean i;
		String num1;
		String cuadrado1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número para ver si es automorfo");		//Declaración de variables
		
		num = scan.nextInt();
		cuadrado = (long) Math.pow(num, 2);					//Calculo el cuadrado del número introducido y lo casteo a long porque sino se sale de los limites de un int
		num1 = String.valueOf(num);
		cuadrado1 = String.valueOf(cuadrado);				//Paso los números a variables String para poder ver caracter a caracter
		len = num1.length() - 1;
		len2 = cuadrado1.length() - 1;						//Calculo la longitud para poder acceder a los caracteres finales del String
		i = true;											//Creo un booleano para decidir si es automorfo o no
		while (len >= 0)
		{
			if (num1.charAt(len) != cuadrado1.charAt(len2))	//Veo si los caracteres finales coinciden con el numero
			{
				i = false;									//Si no coincide en un numero digo que i es falso y rompo el bucle para salir de el		
				break;
			}
			len--;											//Itero sobre las longitudes para poder acceder a los caracteres anteriores
			len2--;
		}
		if (i)												//En caso de que i sea verdadero muestra que el número es automorfo
			System.out.println("El número es automorfo");
		else 												//Sino significa que no lo es
			System.out.println("El número no es automorfo");
	}
}