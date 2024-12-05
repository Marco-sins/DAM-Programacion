package ejercicios;

public class Ejercicio5
{
	private static void imprimePositivo(int p) throws Exception
	{
		if (p < 0)
			throw new Exception("Numero negativo no se puede imprimir aqui");
		else
			System.out.println(p);
		return ;
	}
	
	private static void imprimeNegativo(int n) throws Exception
	{
		if (n >= 0)
			throw new Exception("Numero positivo no se puede imprimir aqui");
		else
			System.out.println(n);
		return ;
	}
	
	public static void main(String[] args) throws Exception
	{
		int i = 0;
		
		System.out.println("imprimeNegativo\n");
		while (i < 6)
		{
			try
			{
				imprimeNegativo(i - 3);
			}
			catch (Exception e)
			{
				System.out.println("Error en " + (i - 3));
			}
			finally
			{
				i++;
			}
		}
		i = 0;
		System.out.println("\nimprimePositivo\n");
		while (i < 6)
		{
			try
			{
				imprimePositivo(i - 3);
			}
			catch (Exception e)
			{
				System.out.println("Error en " + (i - 3));
			}
			finally
			{
				i++;
			}
		}
	}
}