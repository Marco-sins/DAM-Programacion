package ejercicio2;

public class Videoclub {
	private Pelicula[] peliculas;
	private int capacidad;
	private static int can_peliculas;
	
	public Videoclub (int capacidad)
	{
		this.capacidad = capacidad;
		peliculas = new Pelicula[capacidad];
	}
	
	public void agregarPelicula(Pelicula p)
	{
		peliculas[can_peliculas] = p;
		can_peliculas++;
	}
	
	public void mostrarPeliculas()
	{
		int i = 0;
		
		while (i < can_peliculas)
		{
			System.out.print(peliculas[i].get_cod() + " ");
			System.out.print(peliculas[i].get_director() + " ");
			System.out.print(peliculas[i].get_duracion() + " ");
			System.out.print(peliculas[i].get_titulo() + " ");
			System.out.println(peliculas[i].get_alquilada() + " ");
			i++;
		}
	}
	
	public boolean consultarDisponibilidad(String codigo)
	{
		int i = 0;
		
		while (peliculas.length > i)
		{
			if (peliculas[i].get_cod() == codigo)
			{
				if (peliculas[i].get_alquilada() == false)
				{
					return (false);					
				}
				else
					return (true);
			}
			i++;
		}
		return (false);
	}
	
	public void alquilarPelicula(String codigo)
	{
		int i = 0;
		
		while (peliculas.length > i)
		{
			if (peliculas[i].get_cod() == codigo)
			{
				if (peliculas[i].get_alquilada() == false)
				{
					peliculas[i].set_alqulada(true);					
				}
				else
					System.out.println("La pelicula ya esta alquilada");
				return ;
			}
			i++;
		}
		System.out.println("No se ha encontrado la pelicula");
	}
	
	public void devolverPelicula(Pelicula p, boolean esMiembroVIP)
	{
		int i = 0;
		
		while (peliculas.length > i)
		{
			if (peliculas[i] == p)
			{
				peliculas[i].set_alqulada(false);
			}
		}
	}
}