package ejercicio3_1;

public abstract class Vehiculo{
	protected String matricula;
	protected int minutos;
	protected boolean abono;
	
	public Vehiculo (String matricula, int minutos, boolean abono)
	{
		this.matricula = matricula;
		this.minutos = minutos;
		this.abono = abono;
	}
	
	abstract double calcularImporte();

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public boolean isAbono() {
		return abono;
	}

	public void setAbono(boolean abono) {
		this.abono = abono;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", minutos=" + minutos + ", abono=" + abono + "]\n";
	}
	
}
