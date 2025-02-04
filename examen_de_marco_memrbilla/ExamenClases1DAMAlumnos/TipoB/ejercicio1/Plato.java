package ejercicio1;

public class Plato 
{
	private String nombre;
	private String tipoPlato;
	private double precio;
	
	public Plato (String nombre, String tipo, double precio) // Creo el constructor inicializando los valores
	{
		this.nombre = nombre;
		this.tipoPlato = tipo;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", tipoPlato=" + tipoPlato + ", precio=" + precio + "]";
	}

	// Creo todos los seters y geters
	public String getNombre()
	{
		return (nombre);
	}
	
	public String getTipoPlato()
	{
		return (tipoPlato);
	}
	
	public double getPrecio()
	{
		return (precio);
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setTipoPlato(String tipoPlato)
	{
		this.tipoPlato = tipoPlato;
	}
	
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
}
