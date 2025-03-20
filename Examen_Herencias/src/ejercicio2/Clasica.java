package ejercicio2;

public class Clasica extends Pelicula {
	public Clasica(String cod, String titulo, String director, int duracion, boolean alquilada) {
		super(cod, titulo, director, duracion, alquilada);
	}

	public Clasica(String cod, String titulo, String director, int duracion, boolean alquilada, int año_lanzamiento) {
		super(cod, titulo, director, duracion, alquilada);
		this.año_lanzamiento = año_lanzamiento;
	}
	
	
	private int año_lanzamiento;


	@Override
	public double calcularRecargo(int diasRetraso, boolean esMiembroVIP) {
		double recargo = 0;
		if (año_lanzamiento >= 1980)
		{
			recargo = diasRetraso * 0.8;
		}
		else if (año_lanzamiento < 1980)
		{
			recargo = diasRetraso * 0.5;
		}
		if (esMiembroVIP == true)
		{
			recargo = recargo - (recargo * 0.5);
		}
		return (recargo);
	}
}