package ejercicios;

public class ejercicio10 
{
	public static void main(String[] args) 
	{
		int i;
		int cant;

		cant = 0;
		for (i = 0; cant < 10; i++) 
		{
			if (i % 2 != 0)
			{
				System.out.println(i);
				cant++;
			}
		}
	}
}