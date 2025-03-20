package ejercicio1;

public class Moto extends Vehiculo {
	private int cilindrada;
	
	public Moto(String marca, String modelo, String año_matriculacion, double precio)
	{
		super(marca, modelo, año_matriculacion, precio);
	}
	
	public Moto(String marca, String modelo, String año_matriculacion, double precio, int cilindrada)
	{
		super(marca, modelo, año_matriculacion, precio);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public double calcularPrecio()
	{
		if (cilindrada <= 250)
			return (super.calcularPrecio() + (super.calcularPrecio() * 0.02));
		else if (cilindrada >= 300 && cilindrada <= 750)
			return (super.calcularPrecio() + (super.calcularPrecio() * 0.05));
		else
			return (super.calcularPrecio() + (super.calcularPrecio() * 0.1));
	}
	
	public void setCilindrada (int cilindrada)
	{
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada()
	{
		return (cilindrada);
	}
}