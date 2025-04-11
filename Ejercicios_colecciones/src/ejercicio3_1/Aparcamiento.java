package ejercicio3_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aparcamiento {
	private int cantidad;
	private Map<String, ArrayList<Vehiculo>> list = new HashMap<>();
	
	public Aparcamiento (int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	public void introducirVehiculo(Vehiculo v)
	{
		if (list.size() < cantidad)
		{
			if (!list.containsKey(v.matricula))
			{
				list.put(v.matricula, v);
			}
			else
				System.out.println("El vehiculo ya esta dentro");
		}
		else
			System.out.println("No hay espacio");
	}
	
	public void sacarVehiculo(String matricula)
	{
		if (list.containsKey(matricula))
		{
			Vehiculo v = list.get(matricula);
			System.out.println(v.calcularImporte());
			list.remove(matricula);
		}
		else
			System.out.println("El vehiculo no esta dentro");
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Map<String, Vehiculo> getList() {
		return list;
	}

	public void setList(Map<String, Vehiculo> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Aparcamiento [cantidad=" + cantidad + ", list=" + list + "]\n";
	}
	
}
