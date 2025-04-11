package ejercicio2;

import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		// Crear instancia del vivero
		Vivero vivero = new Vivero();

		// Crear varias plantas
		Planta p1 = new PlantaOrnamental("001", "Rosa", 10.5, 50, true);
		Planta p2 = new PlantaFrutal("002", "Manzano", 25.0, 30, "Verano");
		Planta p3 = new PlantaMedicinal("003", "Aloe Vera", 15.0, 20, true);
		Planta p4 = new PlantaOrnamental("004", "Tulipán", 12.0, 40, false);
		Planta p5 = new PlantaFrutal("005", "Prueba", 12.0, 40, "Primavera");

		// Agregar plantas al vivero
		System.out.println("Agregando plantas al vivero...");
		vivero.agregarPlanta(p1);
		vivero.agregarPlanta(p2);
		vivero.agregarPlanta(p3);
		vivero.agregarPlanta(p4);

		// Listar todas las plantas
		System.out.println("\nLista de plantas:");
		vivero.listarPlantas();

		// Probar reposición de stock
		System.out.println("\nReponiendo stock de la planta Rosa...");
		p1.reponerStock(10);
		System.out.println(p1);

		// Probar venta de plantas
		System.out.println("\nVendiendo 5 unidades de la planta Manzano...");
		if (p2.vender(5)) {
			System.out.println("Venta realizada con éxito. Stock restante: " + p2.getStock());
		} else {
			System.out.println("No hay suficiente stock.");
		}

		// Probar calcular descuento
		System.out.println("\nDescuento de la planta Rosa: " + p1.calcularDescuento());
		System.out.println("Descuento de la planta Manzano: " + p2.calcularDescuento());
		System.out.println("Descuento de la planta Aloe Vera: " + p3.calcularDescuento());
		System.out.println("Descuento de la planta prueba: " + p5.calcularDescuento());

		// Filtrar plantas por categoría
		System.out.println("\nFiltrar plantas ornamentales:");
		List<Planta> plantasOrnamentales = vivero.filtrarPorCategoria(p4);
		
			System.out.println(plantasOrnamentales);
		

		
		// Obtener nombres de las plantas
		System.out.println("\nNombres de todas las plantas:");
		List<String> nombresPlantas = vivero.obtenerNombresPlantas();
	
			System.out.println(nombresPlantas);
		

		// Eliminar una planta
		System.out.println("\nEliminando la planta Aloe Vera...");
		vivero.eliminarPlanta("003");

		// Listar plantas después de la eliminación
		System.out.println("\nLista de plantas después de eliminar Aloe Vera:");
		vivero.listarPlantas();
	}
}
