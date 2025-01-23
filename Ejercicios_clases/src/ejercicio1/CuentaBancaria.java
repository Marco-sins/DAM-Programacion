package ejercicio1;

public class CuentaBancaria
{
	private int numeroCuenta = 123456789;
	private int saldo = 100;
	private String titular = "Tu padre";
	
	public void ft_depositar(int cant)
	{
		saldo += cant;
	}
	
	public void ft_retirar(int cant)
	{
		if (cant > saldo)
			System.out.println("No se puede retirar dinero porque no tienes suficiente");
		else
			saldo -= cant;
	}
	
	public void ft_mostrar()
	{
		System.out.println(saldo);
	}
}