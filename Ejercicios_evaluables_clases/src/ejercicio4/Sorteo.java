package ejercicio4;

import java.util.Arrays;

public class Sorteo
{
	private String[] participantes = new String[0];
	private int num_part = 0;
	
	public void agregar_participante(String nombre)
	{
		int i = 0;
		
		while (i < num_part)
		{
			if (this.participantes[i] == nombre)
			{
				System.out.println("Nombre ya existente");
				return ;
			}
			i++;
		}
		this.participantes = Arrays.copyOf(participantes, num_part + 1);
		this.participantes[num_part] = nombre;
		num_part++;
		return ;
	}
	
	public void nombres_azar(int n)
	{
		int i;
		boolean[] parse = new boolean[num_part];
		
		while (n > 0)
		{
			i = (int) (Math.random() * num_part);
			if (parse[i] == false)
			{
				System.out.println(participantes[i]);
				parse[i] = true;
				n--;
			}
		}
	}
	
	public void listar_participantes()
	{
		int i = 0;
		
		while (i < num_part)
		{
			System.out.println("Participante " + i + ": " + participantes[i]);
			i++;
		}
	}
}