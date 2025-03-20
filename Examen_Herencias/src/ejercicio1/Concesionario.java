package ejercicio1;

import java.util.Arrays;

public class Concesionario {
	private Vehiculo[] vehiculos = new Vehiculo[0];
	
	public Concesionario()
	{
		
	}



	@Override
	public String toString() {
		return "Concesionario [vehiculos=" + Arrays.toString(vehiculos) + "]";
	}



	public void agregarVehiculo(Vehiculo v)
	{
		Vehiculo[] vv = new Vehiculo[vehiculos.length + 1];
		int i = 0;
		
		while (i < vehiculos.length)
		{
			vv[i] = vehiculos[i];
			i++;
		}
		vv[i] = v;
		vehiculos = vv;
	}
	
	public double calcularPrecioVehiculo(Vehiculo v)
	{
		int i = 0;
		
		while (i < vehiculos.length && vehiculos[i] != v)
			i++;
		return (vehiculos[i].calcularPrecio());
	}
	
	public void mostrarVehiculos()
	{
		int i = 0;
		
		while (i < vehiculos.length)
		{
			System.out.print(vehiculos[i].getMarca() + " ");
			System.out.print(vehiculos[i].getModelo() + " ");
			System.out.print(vehiculos[i].getAño_matriculacion() + " ");
			System.out.println(vehiculos[i].getPrecio() + " ");
			i++;
		}
	}
	
	public boolean buscarVehiculo(String marca, String modelo)
	{
		int i = 0;
		
		while (i < vehiculos.length)
		{
			if (vehiculos[i].getMarca() == marca && vehiculos[i].getModelo() == modelo)
			{
				System.out.print(vehiculos[i].getMarca() + " ");
				System.out.print(vehiculos[i].getModelo() + " ");
				System.out.print(vehiculos[i].getAño_matriculacion() + " ");
				System.out.println(vehiculos[i].getPrecio() + " ");
				return true;
			}
			i++;
		}
		System.out.println("El vehiculo no existe");
		return false;
	}
	
	public void eliminarVehiculo(String marca, String modelo)
	{
		if (buscarVehiculo(marca, modelo) == true)
		{
			Vehiculo v[] = new Vehiculo[vehiculos.length - 1];
			int i = 0;
			int j = 0;
			
			while (i < vehiculos.length)
			{
				if (j < v.length && (vehiculos[i].getMarca() != marca && vehiculos[i].getModelo() != modelo))
				{
					v[j] = vehiculos[i];
					j++;
				}
				i++;
			}
			vehiculos = v;
		}
	}


}