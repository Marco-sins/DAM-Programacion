package ejercicio8;

public class Color
{
	private String[] color;
	
	public Color()
	{
		this.color = new String[10];
		color[0] = "Azul";
		color[1] = "Verde";
		color[2] = "Rojo";
		color[3] = "Morado";
		color[4] = "Blanco";
		color[5] = "Negro";
		color[6] = "Amarillo";
		color[7] = "Naranja";
		color[8] = "Cian";
		color[9] = "Marron";
	}
	
	public String[] paleta_color(int n)
	{
		int []ar = new int[n];
		String []ars = new String[n];
		int i;
		int x;
		
		x = 0;
		while (x < n)
		{
			i = (int) (Math.random() * 9 + 1);
			for (int j = 0; j < n; j++)
			{
				if (ar[j] == i)
				{
					i =  (int) (Math.random() * 9 + 1);
					j = 0;
				}
			}
			ar[x] = i;
			ars[x] = this.color[i];
			x++;
		}
		
		
		return (ars);
	}
}