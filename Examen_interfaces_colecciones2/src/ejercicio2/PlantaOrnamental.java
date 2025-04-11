package ejercicio2;

public class PlantaOrnamental extends Planta //Hereda de la clase Planta
{
	//Atributos
	private boolean requiereSombra;
	
	//Constructor
	public PlantaOrnamental(String codigoPlanta, String nombre, double precio, int stock, boolean requiereSombra) 
	{
		super(codigoPlanta, nombre, precio, stock);
		this.requiereSombra = requiereSombra;
	}
	//Metodo heredado del padre
	@Override
	double calcularDescuento() 
	{
		return (requiereSombra ? 0.05 : 0);
	}
	//Getters, Setters y toString
	public boolean isRequiereSombra() {
		return requiereSombra;
	}

	public void setRequiereSombra(boolean requiereSombra) {
		this.requiereSombra = requiereSombra;
	}

	@Override
	public String toString() {
		return "PlantaOrnamental [requiereSombra=" + requiereSombra + ", codigoPlanta=" + codigoPlanta + ", nombre="
				+ nombre + ", precio=" + precio + ", stock=" + stock + "]\n";
	}

}
