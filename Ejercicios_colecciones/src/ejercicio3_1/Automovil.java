package ejercicio3_1;

public class Automovil extends Vehiculo{
	private String tipo;
	
	public Automovil(String matricula, int minutos, boolean abono, String tipo) {
		super(matricula, minutos, abono);
		this.tipo = tipo;
	}

	@Override
	double calcularImporte() {
		double total = 0;
		switch (tipo)
		{
		case "turismo":
			total = super.minutos * 1.5 / 60;
			break;
		case "furgoneta":
			total = super.minutos * 3.5 / 60;
			break;
		case "todoterreno":
			total = super.minutos * 2.5 / 60;
			break;
		}
		
		return (super.abono ? (total - (total * 0.4)) : total);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Automovil [tipo=" + tipo + "]\n";
	}
	
}
