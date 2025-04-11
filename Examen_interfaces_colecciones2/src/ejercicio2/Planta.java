package ejercicio2;

public abstract class Planta 
{
	//Creacion de atributos protected para permitir el flujo de informacion entre hijos
	protected String codigoPlanta;
	protected String nombre;
	protected double precio;
	protected int stock;
	@Override
	//Metodos toString y Getters y Setters
	public String toString() {
		return "Planta [codigoPlanta=" + codigoPlanta + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock
				+ "]\n";
	}

	public String getCodigoPlanta() {
		return codigoPlanta;
	}

	public void setCodigoPlanta(String codigoPlanta) {
		this.codigoPlanta = codigoPlanta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	//Constructor de Planta
	public Planta(String codigoPlanta, String nombre, double precio, int stock)
	{
		super();
		this.codigoPlanta = codigoPlanta;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	//Metodo de reponer Stock que sus hijos utilizaran
	public void reponerStock(int cantidad)
	{
		if (cantidad >= 0)
			stock += cantidad;
	}
	//Metodo de vender que sus hijos utilizaran
	public boolean vender(int cantidad)
	{
		if (cantidad <= stock)
		{
			stock -= cantidad;
			return (true);
		}
		return (false);
	}
	//Metodo abstracto que sus hijos deberan implementar
	abstract double calcularDescuento();
}
