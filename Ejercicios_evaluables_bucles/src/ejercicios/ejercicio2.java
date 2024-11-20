package ejercicios;

import java.util.Scanner;

public class ejercicio2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número en binario");
		String binario = scan.nextLine();
		int num = 0;
		int i;
		int potencia = 1;
		for (i = binario.length() - 1; i >= 0; i--)						//Mido la string con el numero en binario para acceder a las posiciones
		{
			if (binario.charAt(i) == '1')								//En caso de que sea uno le sumo la cantidad que se debe
				num += potencia;
			potencia *= 2;												//Multiplico la potencia por 2 para poder ir iterando sobre el string y que le sume lo correcto siempre
			if (binario.charAt(i) != '0' && binario.charAt(i) != '1')	//En caso de que se encuentre algo que no es un numero muestra error
			{
				System.out.println("Error");							
				break;
			}
		}
		System.out.println(num);										//Una vez terminado muestro el numero en decimal
	}
}