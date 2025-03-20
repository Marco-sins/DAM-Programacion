package Ejercicio2;

public class Vehiculos {
	private String matricula;
	private int antiguedad;
	private String color;
	private int plazas;
	private String marca;
	
	public Vehiculos(String matricula, int antiguedad, String color, int plazas, String marca)
	{
		this.matricula = matricula;
		this.antiguedad = antiguedad;
		this.color = color;
		this.plazas = plazas;
		this.marca = marca;
	}
	
	public void set_matricula(String matricula)
	{
		this.matricula = matricula;
	}
	
	public void set_antiguedad(int antiguedad)
	{
		this.antiguedad = antiguedad;
	}
	
	public void set_color(String color) {
		this.color = color;
	}
	
	public void set_plazas(int plazas)
	{
		this.plazas = plazas;
	}
	
	public void set_marca(String marca)
	{
		this.marca = marca;
	}
	
	public String get_matricula()
	{
		return (matricula);
	}
	
	public int get_antiguedad()
	{
		return (antiguedad);
	}
	
	public String get_color()
	{
		return (color);
	}
	
	public int get_plazas()
	{
		return (plazas);
	}
	
	public String get_marca()
	{
		return (marca);
	}
}