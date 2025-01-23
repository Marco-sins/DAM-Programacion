package ejercicio5;

import java.util.Arrays;

public class Agenda
{
	private String[] nombre;
	private int[] numero;
	int num;
	
	public void Agenda()
	{
		this.nombre = new String[10];
		this.numero = new int[10];
		this.num = 0;
	}
	
	public void añadir_contacto(String nombre, int numero)
	{
		if (this.num < 10)
		{
			this.nombre[num] = nombre;
			this.numero[num] = numero;
			num++;
		}
		else
			System.out.println("La agenda esta completa");
	}
	
	public void buscar_contacto(String nombre)
	{
		
	}
	
	public void mostrar_contactos()
	{
		int i;
		
		i = 0;
		while (i < nombre.length)
		{
			System.out.println("Nombre: " + nombre[i] + "");
		}
	}
}