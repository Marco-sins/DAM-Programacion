package ejercicio8;

import java.util.Arrays;

public class main
{
	public static void main(String[] args)
	{
		Color color = new Color();
		
		String[] paleta;
		paleta = color.paleta_color(4);
		System.out.println(Arrays.toString(paleta));
	}
}