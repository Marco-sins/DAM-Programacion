package ejercicio1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GestionBibliotecaManual {
	private Map<String, Album[]> albums = new HashMap<>();
	
	public GestionBibliotecaManual()
	{
		super();
	}
	
	public void agregarAlbum(String genero, Album album) //agrega el album
	{
		Album[] albumes;//creamos nuevo array de albums
		int i;
		
		if (albums.containsKey(genero)) //miramos si el genero existe
		{
			albumes = albums.get(genero);//cogemos el album del genero
			i = 0;
			boolean esta = false;
			
			while (i < albumes.length)//recorremos el array
			{
				if (albumes[i].getCodigoAlbum() == album.getCodigoAlbum())//miramos si el album ya esta dentro
				{
					esta = true;
				}
				i++;
			}
			if (!esta)//si no esta agregamos el album
			{
				albumes = Arrays.copyOf(albumes, i + 1);
				albumes[i] = album;
				albums.replace(genero, albumes);
				ordenarAlbumes(genero);
				System.out.println("Album creado");
			}
			else//si esta mandamos mensaje de que ya esta
				System.out.println("El album ya esta en la biblioteca");
		}
		else//si el genero no existe agregamos un nuevo array al genero
		{
			albumes = new Album[1];
			albumes[0] = album;
			albums.put(genero, albumes);
			System.out.println("Genero creado\nAlbum creado");
		}
	}
	
	public void eliminarAlbum(String genero, String codigoAlbum)
	{
		Album[] albumes;
		Album[] albumes2;
		int i;
		
		if (albums.containsKey(genero))//miramos si el genero existe
		{
			albumes = albums.get(genero);//cogemos el array
			i = 0;
			while (i < albumes.length)//recorremos el array
			{
				if (albumes[i].getCodigoAlbum() == codigoAlbum)//buscamos el codigo
				{
					while (i < albumes.length - 1)//borramos el album
					{
						albumes[i] = albumes[i + 1];
						i++;
					}
					albumes2 = Arrays.copyOf(albumes, albumes.length - 1);
					albums.replace(genero, albumes2);
					if (albumes.length == 0)//borramos el genero si esta vacio
					{
						albums.remove(genero);
						System.out.println("Se ha borrado el album");
					}
				}
				i++;
			}
		}
		else//mandamos mensaje de que no existe el genero
			System.out.println("No existe el genero de tu album");
	}
	
	public void actualizarAlbum(String genero, String codigoAlbum, String nuevoTitulo)
	{
		Album[] albumes;
		int i;
		boolean cambiado = false;
		
		if (albums.containsKey(genero))//miramos si existe el genero
		{
			albumes = albums.get(genero);//cogemos el array
			i = 0;
			while (i < albumes.length)//recorremos el array
			{
				if (albumes[i].getCodigoAlbum() == codigoAlbum)//buscamos el album con el codigo
				{
					albumes[i].setTitulo(nuevoTitulo);//le cambiamos el titulo
					cambiado = true;//ponemos el boolean en true para decir que esta cambiado
				}
				i++;
			}
		}
		else//mandamos mensaje de que no existe el genero
			System.out.println("No existe el genero de tu album");
		if (!cambiado)//mandamos mensaje de que no existe el album
			System.out.println("El album no existe");
	}
	
	public void listarAlbumes(String genero)
	{
		Album[] albumes;
		
		if (albums.containsKey(genero))//buscamos el genero
		{
			albumes = albums.get(genero);
			System.out.println(Arrays.toString(albumes));//Printeamos el array
		}
		else
			System.out.println("El genero no existe");//mensaje de que no existe el genero
	}
	
	public Album buscarAlbum(String genero, String codigoAlbum)
	{
		Album[] albumes;
		int i;
		
		if (albums.containsKey(genero))//miramos si existe el genero
		{
			albumes = albums.get(genero);
			i = 0;
			while (i < albumes.length)//recorremos el array
			{
				if (albumes[i].getCodigoAlbum() == codigoAlbum)//buscamos el album con el codigo
					return (albumes[i]);
				i++;
			}
			System.out.println("No existe tu album");//no existe el album al llegar hasta aqui, tendria que haber parado en el return si existiese
		}
		else
			System.out.println("No existe el genero de tu album");//mensaje de que no existe el album
		return null;
		
	}
	
	private void ordenarAlbumes(String genero) //funcion privada que ordena el array con los albums
	{
		Album[] albumes;
		Album[] albumes2;
		Album aux;
		int i;
		
		if (albums.containsKey(genero)) //miramos si el genero existe
		{
			albumes = albums.get(genero);//cogemos el array
			i = 0;
			while (i < albumes.length - 1)
			{
				if (albumes[i].getAnioLanzamiento() > albumes[i + 1].getAnioLanzamiento())
				{
					aux = albumes[i];
					albumes[i] = albumes[i + 1];
					albumes[i + 1] = aux;
					i = 0;
				}
				i++;
			}
		}
	}
}
