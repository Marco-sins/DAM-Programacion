package ejercicio2;

public class Cambio
{
	private int[] billete = {5, 10, 20, 50, 100, 200, 500};
	private int[] billetes = new int[7];
	private double[] moneda = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2};
	private int[] monedas = new int[8];
	private double total;
	private double saldo;
	private double devolver;
	
	
	public Cambio(double total, double pagar)
	{
		this.total = total;
		saldo = pagar;
	}
	
	public void set_total(double total)
	{
		this.total = total;
	}
	
	public double get_total()
	{
		return (total);
	}
	
	public void ft_imprimir()
	{
		System.out.println("Billete de 500 euros: " + billetes[6]);
		System.out.println("Billete de 200 euros: " + billetes[5]);
		System.out.println("Billete de 100 euros: " + billetes[4]);
		System.out.println("Billete de 50 euros: " + billetes[3]);
		System.out.println("Billete de 20 euros: " + billetes[2]);
		System.out.println("Billete de 10 euros: " + billetes[1]);
		System.out.println("Billete de 5 euros: " + billetes[0]);
		
		System.out.println("Monedas de 2 euro: " + monedas[7]);
		System.out.println("Monedas de 1 euro: " + monedas[6]);
		System.out.println("Monedas de 50 centimos: " + monedas[5]);
		System.out.println("Monedas de 20 centimos: " + monedas[4]);
		System.out.println("Monedas de 10 centimos: " + monedas[3]);
		System.out.println("Monedas de 5 centimos: " + monedas[2]);
		System.out.println("Monedas de 2 centimos: " + monedas[1]);
		System.out.println("Monedas de 1 centimos: " + monedas[0]);
	}
	
	public void imprimir_cambio()
	{
		devolver = saldo - total;
		
		int i = billete.length - 1;
		
		while (devolver > 0 && i >= 0)
		{
			if (devolver >= billete[i])
			{
				devolver -= billete[i];
				billetes[i]++;
			}
			else
				i--;
		}
		i = moneda.length - 1;
		while (devolver > 0 && i >= 0)
		{
			if (devolver >= moneda[i])
			{
				devolver -= moneda[i];
				monedas[i]++;
			}
			else
				i--;
		}
		ft_imprimir();
	}
}