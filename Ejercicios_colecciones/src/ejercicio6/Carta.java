package ejercicio6;

public class Carta {
	@Override
	public String toString() {
		return "Carta [palo = " + palo + ", valor = " + valor + "]\n";
	}

	private String palo;
	private int valor;
	
	public Carta (String palo, int valor)
	{
		super();
		this.palo = palo;
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getTipo() {
		return valor;
	}

	public void setTipo(int tipo) {
		this.valor = tipo;
	}
}
