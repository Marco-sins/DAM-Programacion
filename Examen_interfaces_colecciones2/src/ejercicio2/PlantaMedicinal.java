package ejercicio2;

public class PlantaMedicinal extends Planta //Hereda de la clase Planta
{
	//Atributos
	private boolean esAutoctona;
	//Constructor
	public PlantaMedicinal(String codigoPlanta, String nombre, double precio, int stock, boolean esAutoctona) 
	{
		super(codigoPlanta, nombre, precio, stock);
		this.esAutoctona = esAutoctona;
	}
	//Metodo heredado del padre
	@Override
	double calcularDescuento() 
	{
		return (esAutoctona ? 0.15 : 0);
	}
	//Getters, Setters y toString
	public boolean isEsAutoctona() {
		return esAutoctona;
	}

	public void setEsAutoctona(boolean esAutoctona) {
		this.esAutoctona = esAutoctona;
	}

	@Override
	public String toString() {
		return "PlantaMedicinal [esAutoctona=" + esAutoctona + ", codigoPlanta=" + codigoPlanta + ", nombre=" + nombre
				+ ", precio=" + precio + ", stock=" + stock + "]\n";
	}

}
