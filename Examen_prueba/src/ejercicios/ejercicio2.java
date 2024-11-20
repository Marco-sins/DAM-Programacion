package ejercicios;

public class ejercicio2
{
	public static void main(String[] args)
	{
		int i = 1;
		int j = 1;
		for (int cont = 0; cont < 10; cont++)
		{
			System.out.print(i + " " + j + " ");
			i += j;
			j += i;
		}
	}
}