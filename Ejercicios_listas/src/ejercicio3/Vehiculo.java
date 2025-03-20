package ejercicio3;

public abstract class Vehiculo {
	private int minutos_aparcados;
	private String matricula;
	private boolean abonado;
	
	abstract void calcular_importe();
}
