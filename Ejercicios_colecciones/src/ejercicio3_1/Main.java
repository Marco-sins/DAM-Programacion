package ejercicio3_1;

public class Main {
	public static void main(String[] args)
	{
		Vehiculo turismo = new Automovil("1234A", 45, false, "turismo");
		Vehiculo furgoneta = new Automovil("1234B", 30, true, "furgoneta");
		Vehiculo todoterreno = new Automovil("1234C", 60, true, "todoterreno");
		Vehiculo camion3 = new Camion("1234D", 20, false, 3);
		Vehiculo camion4 = new Camion("1234E", 150, true, 4);
		Aparcamiento ap = new Aparcamiento(4);
		
		ap.introducirVehiculo(turismo);
		ap.introducirVehiculo(furgoneta);
		ap.introducirVehiculo(todoterreno);
		ap.introducirVehiculo(camion3);
		ap.introducirVehiculo(turismo);
		
		ap.sacarVehiculo("1234A");
		ap.sacarVehiculo("1234B");
		ap.sacarVehiculo("1234C");
		ap.sacarVehiculo("1234D");
		ap.sacarVehiculo("1234E");
	}
}
