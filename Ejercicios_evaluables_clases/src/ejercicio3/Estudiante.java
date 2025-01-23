package ejercicio3;

public class Estudiante
{
	private String nombre;
	private int edad;
	private int calificacion;
	
	public Estudiante(String nombre, int edad, int calificacion)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}
	
	public void set_nombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void set_edad(int edad)
	{
		this.edad = edad;
	}
	
	public void set_calificacion(int calificacion)
	{
		this.calificacion = calificacion;
	}
	
	public String get_nombre()
	{
		return (nombre);
	}
	
	public int get_edad()
	{
		return (edad);
	}
	
	public int get_calificacion()
	{
		return (calificacion);
	}
}