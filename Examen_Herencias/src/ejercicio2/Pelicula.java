package ejercicio2;

public abstract class Pelicula {
	private String cod;
	private String titulo;
	private String director;
	private int duracion;
	private boolean alquilada;
	
	public Pelicula (String cod, String titulo, String director, int duracion, boolean alquilada)
	{
		this.cod = cod;
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.alquilada = alquilada;
	}
	
	public abstract double calcularRecargo(int diasRetraso, boolean esMiembroVIP);
	
	public void set_alqulada(boolean alquilada)
	{
		this.alquilada = alquilada;
	}
	
	public String get_cod()
	{
		return (cod);
	}
	
	public String get_titulo()
	{
		return (titulo);
	}
	
	public String get_director()
	{
		return (director);
	}
	
	public int get_duracion()
	{
		return (duracion);
	}
	
	public boolean get_alquilada()
	{
		return (alquilada);
	}
}