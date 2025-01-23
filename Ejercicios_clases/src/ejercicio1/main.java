package ejercicio1;

import java.util.InputMismatchException;

public class main
{
	public static void main(String[] args)
	{
		CuentaBancaria cuenta = new CuentaBancaria();
		
		try 
		{
			cuenta.ft_mostrar();
			cuenta.ft_depositar(10);
			cuenta.ft_mostrar();
			cuenta.ft_retirar(100);
			cuenta.ft_mostrar();
			cuenta.ft_retirar(10);
			cuenta.ft_mostrar();
			cuenta.ft_retirar(15);
			cuenta.ft_mostrar();
		}
		catch(InputMismatchException e)
		{
			System.out.println("No has introducido un valor correctamente");
		}
	}
}