package ejercicio3;

public class Coche
{
	private String marca;
	private String modelo;
	private Persona propietario;
	
	public void set_marca(String s)
	{
		marca = s;
	}
	
	public void set_modelo(String s)
	{
		modelo = s;
	}
	
	public void set_propietario(Persona p)
	{
		propietario = p;
	}
}