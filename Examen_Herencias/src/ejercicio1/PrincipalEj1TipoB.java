package ejercicio1;

public class PrincipalEj1TipoB {
	public static void main(String[] args) {
		// Crear un concesionario con capacidad inicial de 2 vehículos
		Concesionario concesionario = new Concesionario();

		// Crear vehículos
		Vehiculo coche1 = new Coche("Toyota", "Corolla", "2010", 15000, 4);
		Vehiculo moto1 = new Moto("Honda", "CBR500R", "2022", 7000, 500);

		// Agregar vehículos al concesionario
		concesionario.agregarVehiculo(coche1);
		concesionario.agregarVehiculo(moto1);

		// Mostrar vehículos en el concesionario
		concesionario.mostrarVehiculos();

		// Calcular el precio de un vehículo específico
		System.out.println("Precio total del coche: " + concesionario.calcularPrecioVehiculo(coche1));
		System.out.println("Precio total de la moto: " + concesionario.calcularPrecioVehiculo(moto1));

		// Buscar un vehículo
		concesionario.buscarVehiculo("Honda", "CBR500R");

		// Eliminar un vehículo
		concesionario.eliminarVehiculo("Toyota", "Corolla");

		// Mostrar vehículos después de eliminar uno
		concesionario.mostrarVehiculos();
	}
}
