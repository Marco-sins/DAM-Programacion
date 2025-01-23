package ejercicio3;

public class Persona
{
	private String nombre = "";
	private int edad = 0;
	
	public void set_edad(int n)
	{
		edad = n;
	}
	
	public void set_nombre(String s)
	{
		nombre = s;
	}
	
	public void mostrar()
	{
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	public void mayor()
	{
		if (edad < 18)
			System.out.println("Menor");
		else
			System.out.println("Mayor");
	}
}