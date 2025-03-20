package Ejercicio2;

import java.util.Arrays;

public class Lista_vehiculos implements Modificador {
	Vehiculos[] listado = new Vehiculos[0];
	
	public Lista_vehiculos()
	{
		
	}
	
	@Override
	public void mod_antiguedad(int año) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mod_matricula(String matricula) {
		// TODO Auto-generated method stub
		
	}
	
	public void agregar_vehiculo(Vehiculos v)
	{
		int i = listado.length;
		
		listado = Arrays.copyOf(listado, i + 1);
		listado[i] = v;
	}
	
	public Vehiculos[] arraySort()
	{
		int i = 0;
		int j = 0;
		int aux;
		Vehiculos[] v = new Vehiculos[listado.length];
		
		while (i < listado.length)
		{
			j = i;
			aux = 0;
			while (j < listado.length)
			{
				if (aux < listado[j].get_matricula())
			}
		}
	}
	
}