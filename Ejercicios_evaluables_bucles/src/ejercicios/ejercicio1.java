package ejercicios;

import java.util.Scanner;

public class ejercicio1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		String binario = "";
		int entero = scan.nextInt();
		int i;
		String str = "";
		if (entero >= 0)
		{
			while (entero > 0)
			{
				if (entero % 2 == 1) 	//Le hago el modulo entre dos para ver si en la posicion debe ir un 1 o un 0, 
					binario += "1";		//Si el modulo es 1 le añado al String un 1
				else
					binario += "0";		//En caso contrario le añado un 0
				entero /= 2;			//Divido entre dos para que pase a la siguiente posicion en el binario
			}
			i = binario.length() - 1;	//Mido cuantos 0 y 1 he puesto para darle la vuelta a la String ya que se coloca al reves de esta forma
			while (i >= 0)
			{
				str += binario.charAt(i);
				i--;
			}
			System.out.println(str);	//Una vez hecho muestro el numero en binario 
		}
		else
			System.out.println("Error");//En caso de que el numero sea negativo imprime error
	}
}