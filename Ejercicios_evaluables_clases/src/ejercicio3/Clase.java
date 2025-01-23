package ejercicio3;

import java.util.Arrays;

public class Clase
{
	private String nombre;
	private int num_estudiantes;
	private Estudiante[] estudiantes = new Estudiante[num_estudiantes];
	
	public Clase(String nombre, int num_estudiantes, Estudiante[] estudiantes)
	{
		this.nombre = nombre;
		this.num_estudiantes = num_estudiantes;
		this.estudiantes = estudiantes;
	}
	
	public void set_nombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void set_num_estudiantes(int num_estudiantes)
	{
		this.num_estudiantes = num_estudiantes;
	}
	
	public void set_estudiantes(Estudiante[] estudiantes)
	{
		this.estudiantes = estudiantes;
	}
	
	public String get_nombre()
	{
		return (nombre);
	}
	
	public int get_num_estudiantes()
	{
		return (num_estudiantes);
	}
	
	public Estudiante[] get_estudiantes()
	{
		return (estudiantes);
	}
	
	public double calcularPromedioCalificaciones()
	{
		int i = 0;
		double total = 0;
		
		while (i < estudiantes.length)
		{
			total += estudiantes[i].get_calificacion();
			i++;
		}
		total /= num_estudiantes;
		return (total);
	}
	
	public void mostrar_estudiantes()
	{
		int i = 0;
		
		System.out.println("Estudiantes: ");
		while (i < num_estudiantes)
		{
			System.out.println(estudiantes[i].get_nombre() + " " + estudiantes[i].get_edad() + " " + estudiantes[i].get_calificacion());
			i++;
		}
	}
	
	
	
	public void agregar_estudiante(Estudiante estudiante)
	{
		estudiantes = Arrays.copyOf(estudiantes, num_estudiantes + 1);
		estudiantes[num_estudiantes] = estudiante;
		num_estudiantes++;
	}
	
	public void eliminar_estudiante(Estudiante estudiante)
	{
		int i = 0;
		
		while (estudiantes.length > i)
		{
			if (estudiantes[i] == estudiante)
			{
				while (estudiantes.length > i + 1)
				{
					estudiantes[i] = estudiantes[i + 1];
					i++;
				}
			}
			i++;
		}
		num_estudiantes--;
	}
	
	public Estudiante buscar_estudiante(String nombre)
	{
		int i = 0;
		while (i < estudiantes.length)
		{
			if (estudiantes[i].get_nombre() == nombre)
				return (estudiantes[i]);
			i++;
		}
		return (null);
	}
}