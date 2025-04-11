package ejercicio5;

public class Moneda {
	private String tipo;
	private double cant;
	
	public Moneda(double cant, String tipo)
	{
		super();
		this.tipo = tipo;
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "Moneda [tipo=" + tipo + ", cant=" + cant + "]\n";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCant() {
		return cant;
	}

	public void setCant(double cant) {
		this.cant = cant;
	}
	
	
}
