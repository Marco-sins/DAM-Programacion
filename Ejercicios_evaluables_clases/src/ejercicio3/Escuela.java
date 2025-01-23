package ejercicio3;

import java.util.Arrays;

public class Escuela
{
	private Clase[] clase = new Clase[30];
	private int num_clases;
	
	public Escuela(Clase[] clase, int num_clases)
	{
		this.clase = clase;
		this.num_clases = num_clases;
	}
	
	public void set_clase(Clase[] clase)
	{
		this.clase = clase;
	}
	
	public void set_num_clases(int num_clases)
	{
		this.num_clases = num_clases;
	}
	
	public Clase[] get_clase()
	{
		return (clase);
	}
	
	public int get_num_clases()
	{
		return (num_clases);
	}
	
	public void agregar_clase(Clase clase)
	{
		this.clase = Arrays.copyOf(this.clase, num_clases + 1);
		this.clase[num_clases] = clase;
		num_clases++;
	}
	
	public void eliminar_clase(Clase clase)
	{
		int i = 0;
		
		while (this.clase.length > i)
		{
			if (this.clase[i] == clase)
			{
				while (this.clase.length > i + 1)
				{
					this.clase[i] = this.clase[i + 1];
					i++;
				}
			}
			i++;
		}
		this.clase[i - 1] = null;
		num_clases--;
	}
	
	public Clase buscar_clase(String nombre)
	{
		int i = 0;
		
		while (i < num_clases)
		{
			if (clase[i].get_nombre() == nombre)
				return (clase[i]);
			i++;
		}
		return (null);
	}
	
	public void mostrar_estadistica_por_clase()
	{
		int i = 0;
		
		while (i < clase.length)
		{
			System.out.println(clase[i].get_nombre() + "-->" + clase[i].calcularPromedioCalificaciones());
			i++;
		}
	}
	
	public Estudiante buscar_estudiante_en_todas_las_clases(String nombre)
	{
		int i = 0;
		int j;
		
		while (i < clase.length)
		{
			j = 0;
			while (j < clase[i].get_num_estudiantes())
			{
				if (clase[i].get_estudiantes()[j].get_nombre() == nombre)
					return (clase[i].get_estudiantes()[j]);
				j++;
			}
			i++;
		}
		return (null);
	}
}