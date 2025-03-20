package ejercicio1;

public class Coche extends Vehiculo {
	private int puertas;
	
	public Coche(String marca, String modelo, String año_matriculacion, double precio)
	{
		super(marca, modelo, año_matriculacion, precio);
	}
	
	public Coche(String marca, String modelo, String año_matriculacion, double precio, int puertas)
	{
		super(marca, modelo, año_matriculacion, precio);
		this.puertas = puertas;
	}
	
	public int getPuertas()
	{
		return (puertas);
	}
	
	public void setPuertas(int puertas)
	{
		this.puertas = puertas;
	}
}