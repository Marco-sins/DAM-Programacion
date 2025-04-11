package ejercicio2;

public class PlantaFrutal extends Planta //Hereda de la clase Plana
{
	//Atributos
	private String estacionFructificacion;
	//Constructor
	public PlantaFrutal(String codigoPlanta, String nombre, double precio, int stock, String estacionFructificacion) 
	{
		super(codigoPlanta, nombre, precio, stock);
		this.estacionFructificacion = estacionFructificacion;
	}
	//Metodo heredado del padre
	@Override
	double calcularDescuento() 
	{
		return (estacionFructificacion.toLowerCase().equals("primavera") ? 0.1 : 0);
	}
	//Getters, Setters y toString
	public String getEstacionFructificacion() {
		return estacionFructificacion;
	}

	public void setEstacionFructificacion(String estacionFructificacion) {
		this.estacionFructificacion = estacionFructificacion;
	}

	@Override
	public String toString() {
		return "PlantaFrutal [estacionFructificacion=" + estacionFructificacion + ", codigoPlanta=" + codigoPlanta
				+ ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]\n";
	}

}
