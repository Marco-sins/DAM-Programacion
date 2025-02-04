package ejercicio1;

import java.util.Arrays;

public class Menu 
{
	private Plato[] platos;
	
	public Menu() // Creo el objeto inicializando el array de platos
	{
		this.platos = new Plato[0];
	}
	
	@Override
	public String toString() {
		return "Menu [platos=" + Arrays.toString(platos) + "]";
	}

	public void anadirPlato(Plato c) // En este metodo añado un nuevo plato redimensionando el Array
	{
		int i;
		Plato p[] = new Plato[platos.length + 1];
		
		i = platos.length;
		for (int j = 0; j < platos.length; j++)
		{
			p[j] = platos[j];
		}
		p[i] = c;
		platos = p;
	}
	
	public Plato[] generarPlatosAleatorios(int n) // En este metodo creo un array de platos aleatorios 
	{
		if (n < platos.length)
		{
			int[] ar = new int[platos.length];
			Plato[] menu_aleatorio = new Plato[n];
			int i;
			int j = 0;
		
			while(n > j)
			{
				i = (int) (Math.random() * platos.length);
				if (ar[i] == 0)
				{
					menu_aleatorio[j] = platos[i];
					ar[i] = 1;
					j++;
				}
			}
			return (menu_aleatorio);
		}
		else if (n == platos.length)
			return (platos);
		else 
		{
			System.out.println("No hay suficientes platos");
			return (platos);
		}
	}
	
	public Plato[] generarListaPorTipo(String tipo_plato, int n) // En este metodo devuelvo un array de platos filtrados por el tipo que se pasa como parametro
	{
		
		Plato[] menu_aleatorio = new Plato[n];
		int[] ar = new int[platos.length];
		int i;
		int j;
		int k;
		
		j = 0;		
		for (i = 0; i < platos.length; i++)
		{
			if (platos[i].getTipoPlato() == tipo_plato)
				j++;
		}
		
		Plato[] menu2 = new Plato[j];
		k = 0;
		for (i = 0; i < platos.length; i++)
		{
			if (platos[i].getTipoPlato() == tipo_plato)
			{
				menu2[k] = platos[i];
				k++;
			}
		}
		if (j > n)
		{
			while(n > 0)
			{
				i = (int) (Math.random() * platos.length);
				if (ar[i] == 0 && platos[i].getTipoPlato() == tipo_plato)
				{
					menu_aleatorio[n - 1] = platos[i];
					ar[i] = 1;
					n--;
				}
			}
		}
		else 
		{
			System.out.println("No hay suficientes platos");
			return (menu2);
		}
		return (menu_aleatorio);
	}
}
