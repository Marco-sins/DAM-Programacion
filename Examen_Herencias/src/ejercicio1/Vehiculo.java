package ejercicio1;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private String año_matriculacion;
	private double precio;
	
	public Vehiculo (String marca, String modelo, String año_matriculacion, double precio)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.año_matriculacion = año_matriculacion;
		this.precio = precio;
	}
	
	public double calcularPrecio()
	{
		int año = Integer.valueOf(año_matriculacion);
		if (año > 2003)
			return (precio + 5000);
		else
			return (precio);
	}
	
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
	
	public void setAño_matriculacion(String año_matriculacion)
	{
		this.año_matriculacion = año_matriculacion;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public double getPrecio()
	{
		return (precio);
	}
	
	public String getAño_matriculacion()
	{
		return (año_matriculacion);
	}
	
	public String getModelo()
	{
		return (modelo);
	}
	
	public String getMarca()
	{
		return (marca);
	}
}