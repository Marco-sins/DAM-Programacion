package ejercicio2;

import java.util.List;

public interface GestionVivero 
{
	//Interfaz con las dos funciones que se deberan implementar
	public List<Planta> filtrarPorCategoria(Planta categoria);
	public List<String> obtenerNombresPlantas();
}
