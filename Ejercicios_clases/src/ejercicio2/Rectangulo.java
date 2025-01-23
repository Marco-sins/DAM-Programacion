package ejercicio2;

public class Rectangulo
{
	private int largo = 0;
	private int ancho = 0;
	private int perimetro = 0;
	private int area = 0;
	
	public void set_largo(int n)
	{
		largo = n;
	}
	
	public void set_ancho(int n)
	{
		ancho = n;
	}
	
	public void ft_perimetro()
	{
		perimetro = 2 * (largo + ancho);
	}
	
	public void ft_area()
	{
		area = largo * ancho;
	}
	
	public void ft_mostrar()
	{
			System.out.println("Perimetro: " + perimetro);
			System.out.println("Area: " + area);
	}
}