package ejercicios;

public class ejercicio18
{
	public static void main(String[] args)
	{
		int i;
		int j;
		
		i = 1;
		j = 1;
		for (i = 1; i <= 5; i++)
		{
			System.out.print(i);
			System.out.print("	" + i * i);
			System.out.println("	" + (i * i * i));
		}
	}
}