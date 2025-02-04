package ejercicio2;

import java.util.Arrays;

import ejercicio1.Plato;

public class PlataformaPeliculas {
	private String[] totalPeliculas;
	
	
	public PlataformaPeliculas() // Creo el constructor inicializando el array de los nombres de las peliculas
	{
		totalPeliculas = new String[0];
	}
	
	@Override
	public String toString() {
		return "PlataformaPeliculas [totalPeliculas=" + Arrays.toString(totalPeliculas) + "]";
	}

	public void registrarPelicula(String s) // En este metodo meto el nombre de las peliculas en el array mirando primero que no este llena y no este ya registrada
	{
		int i = 0;
		
		if (totalPeliculas.length >= 100)
		{
			System.out.println("Ya se ha llenado la plataforma"); // Miro si esta lleno
			return;
		}
		while (i < totalPeliculas.length) // Miro si ya esta registrada
		{
			if (totalPeliculas[i] == s)
			{
				System.out.println("La pelicula ya ha sido registrada");
				return;
			}
			i++;
		}
		String[] topel = new String[totalPeliculas.length + 1];
		i = 0;
		while (i < totalPeliculas.length) // Añado la pelicula
		{
			topel[i] = totalPeliculas[i];
			i++;
		}
		topel[i] = s;
		totalPeliculas = topel;
	}
	
	public void eliminarPelicula(String s) // En este metodo elimino la pelicula que me pasan como parametro si esta introducida, si no mando un mensaje de que no esta introducida
	{
		int i = 0;
		
		while (i < totalPeliculas.length)
		{
			if (totalPeliculas[i] == s)
			{
				while (i + 1 < totalPeliculas.length)
				{
					totalPeliculas[i] = totalPeliculas[i + 1];
					i++;
				}
				totalPeliculas[i] = null;
				return;
			}
			i++;
		}
		System.out.println("No se ha encontrado la pelicula");
		return ;
	}
	
	public String buscarPelicula(String s) // En este metodo busco la pelicula que me pasan como parametro
	{
		int i;
		
		i = 0;
		while (i < totalPeliculas.length)
		{
			if (totalPeliculas[i] == s)
				return ("Esta");
			i++;
		}
		return ("No esta");
	}
	
	public int consultarEspacio() // En este metodo devuelvo el espacio que queda en el array de peliculas
	{
		int i = totalPeliculas.length;
		
		return (100 - i);
	}
	
	public void mostrarPeliculasAlmacenadas() // En este metodo muestro una lista de todas las peliculas
	{
		int i;
		
		i = 0;
		while (totalPeliculas.length > i)
		{
			System.out.println("[" + i + "] " + totalPeliculas[i]);
			i++;
		}
	}
}
