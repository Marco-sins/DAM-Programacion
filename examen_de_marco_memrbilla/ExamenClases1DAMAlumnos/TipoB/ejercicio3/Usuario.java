package ejercicio3;

public class Usuario {
	private static int totalUsuarios = 0; // Creo la variable estatica
	private String nombre;
	
	public Usuario() // Creo un constructor vacio
	{

	}
	
	public void añadirUsuario(String nombre) // En este metodo añado los usuarios que me pasan por parametro
	{
		this.nombre = nombre;
		this.totalUsuarios++;
	}
	
	// Creo los geters y seters
	public String getNombre()
	{
		return (nombre);
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getTotalUsuarios()
	{
		return (totalUsuarios);
	}
}
