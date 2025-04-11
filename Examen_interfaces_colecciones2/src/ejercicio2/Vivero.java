package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vivero implements GestionVivero //Implementa la interfaz GestionVivero
{
	//Atributos
	List<Planta> vivero = new ArrayList<Planta>();
	
	//Constructor 
	public Vivero()
	{
		
	}
	
	//Metodo que agrega una planta a la lista vivero
	public void agregarPlanta(Planta planta)
	{
		//Se crea un iterador para mirar si ya esta la planta
		Iterator<Planta> it = vivero.iterator();
		Planta p;
		boolean esta = false;
		
		while (it.hasNext())
		{
			p = it.next();
			//Se comprueba si esta la planta
			if (p.getCodigoPlanta().equals(planta.getCodigoPlanta()))
				esta = true;
		}
		if (esta)//En caso de que este manda un mensaje 
			System.out.println("La planta ya esta en el vivero");
		else //En caso contrario añade la planta al vivero
			vivero.add(planta);
	}
	
	//Metodo que elimina una planta del vivero
	public void eliminarPlanta(String codigoPlanta)
	{
		//Se crea un iterador para mirar si existe la planta y para buscar la planta
		Iterator<Planta> it = vivero.iterator();
		Planta p;
		boolean esta = false;
		
		while (it.hasNext())
		{
			p = it.next();
			//Se mira si es la planta que se busca
			if (p.getCodigoPlanta().equals(codigoPlanta))
			{
				vivero.remove(p);
				esta = true;
			}
		}
		if (!esta) //En caso de que no este manda mensaje
			System.out.println("La planta no esta en el vivero");
	}
	
	//Funcion de la interfaz GestionVivero que filtra las plantas por su tipo
	@Override
	public List<Planta> filtrarPorCategoria(Planta categoria) 
	{
		//Se crea una lista nueva para las plantas filtradas
		List<Planta> list = new ArrayList<Planta>();
		//Se crea un iterador para ir comprobando las plantas 
		Iterator<Planta> it = vivero.iterator();
		Planta p;
		
		while (it.hasNext())
		{
			p = it.next();
			//Miramos a que categoria pertenece la planta 
			if (categoria instanceof PlantaOrnamental && p instanceof PlantaOrnamental)
					list.add(p);
			else if (categoria instanceof PlantaFrutal && p instanceof PlantaFrutal)
					list.add(p);
			else if (categoria instanceof PlantaMedicinal && p instanceof PlantaMedicinal)
					list.add(p);
		}
		//Devuelve la lista con las plantas filtradas
		return (list);
	}

	//Metodo de la interfaz GestionVivero que devuelve una lista con todos los nombres de las plantas del vivero
	@Override
	public List<String> obtenerNombresPlantas() 
	{
		//Se crea una nueva lista para los nombres de las plantas
		List<String> list = new ArrayList<String>();
		//Se crea un iterador para ir mirando planta a planta
		Iterator<Planta> it = vivero.iterator();
		Planta p;
		
		while (it.hasNext())
		{
			p = it.next();
			//Se añade a la lista el nombre de la planta
			list.add(p.getNombre());
		}
		//Devuelve la lista con los nombres de todas las plantas
		return (list);
	}


	//Metodo que lista todas las plantas del vivero
	public void listarPlantas() 
	{
		System.out.println(vivero.toString());
	}


	//Metodo toString
	@Override
	public String toString() {
		return "Vivero [vivero=" + vivero + "]\n";
	}

}
