package ejercicios;

public class ejercicio14
{
	public static void main(String[] args)
	{
		int i;
		int j;
		
		i = 0;
		j = 0;
		for (i = 1; i <= 10; i++)
		{
			for (j = 0; j <= 10; j++)
			{
				System.out.print(j * i + " ");
			}
			System.out.print("\n");
		}
	}
}