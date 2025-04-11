package ejercicio3_1;

public class Camion extends Vehiculo{
	private int ejes;
	
	
	public Camion (String matricula, int minutos, boolean abonado, int ejes)
	{
		super(matricula, ejes, abonado);
		this.ejes = ejes;
	}
	
	@Override
	double calcularImporte() {
		double total = 0;
		
		if(ejes <= 3)
			total = super.minutos * 4.5 / 60;
		else
			total = super.minutos * 6.5 / 60;
		
		return (super.abono ? (total - (total * 0.4)) : total);
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	@Override
	public String toString() {
		return "Camion [ejes=" + ejes + "]\n";
	}

}
