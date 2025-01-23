package ejercicio1;

public class main
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 25; i++)
		{
			CifradoCesar cesar = new CifradoCesar(i);
			cesar.ft_cifrar("Hola soy jezu trabajo en bartolome seguros me falta pelo arriba pero soy majo soy el rey del mambo alguna guarra pero fea por benalmadena");
			System.out.println();
		}
		
		
		
		return ;
	}
}