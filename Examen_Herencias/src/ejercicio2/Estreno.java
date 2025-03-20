package ejercicio2;

public class Estreno extends Pelicula{
	public Estreno(String cod, String titulo, String director, int duracion, boolean alquilada) {
		super(cod, titulo, director, duracion, alquilada);
	}
	
	public Estreno (String cod, String titulo, String director, int duracion, boolean alquilada, String genero)
	{
		super(cod, titulo, director, duracion, alquilada);
		this.genero = genero;
	}

	private String genero;

	@Override
	public double calcularRecargo(int diasRetraso, boolean esMiembroVIP) {
		double recargo = 0;
		if (genero == "acción")
		{
			recargo = diasRetraso * 1.5;
		}
		else if (genero == "comedia")
		{
			recargo = diasRetraso * 1.2;
		}
		else if (genero == "drama")
		{
			recargo = diasRetraso;
		}
		if (esMiembroVIP == true)
		{
			recargo = recargo - (recargo * 0.5);
		}
		return (recargo);
	}
	
	public void setGenero(String genero)
	{
		this.genero = genero;
	}
	
	public String getGenero() 
	{
		return (genero);
	}
}