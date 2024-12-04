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
		imprimeNegativo(-1);
		//imprimeNegativo(0);
		//imprimeNegativo(1);
		//imprimePositivo(-1);
		imprimePositivo(0);
		imprimePositivo(1);
	}
}