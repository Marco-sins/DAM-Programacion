package ejercicios;

public class ejercicio34
{
	public static void main(String[] args)
	{
		int i;
		
		i = 1;
		while (i <= 20)
		{
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println(i + " Divisible por 3 y 5");
			else if (i % 3 == 0)
				System.out.println(i + " Divisible por 3");
			else if (i % 5 == 0)
				System.out.println(i + " Divisible por 5");
			else 
				System.out.println(i);
			i++;
		}
	}
}