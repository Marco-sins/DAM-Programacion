package ejercicio5;

import java.util.Arrays;

public class Inventario
{
	private String[] nombre_producto = new String[0];
	private int[] cantidad_producto = new int[0];
	
	public double calcular_valor_total(double[] valor)
	{
		int i = 0;
		double total = 0;
		
		while (i < nombre_producto.length)
		{
			total += cantidad_producto[i] * valor[i];
			i++;
		}
		return (total);
	}
	
	public void mostrar_inventario()
	{
		int i = 0;
		
		while (i < nombre_producto.length)
		{
			System.out.println("Producto: " + nombre_producto[i] + "Cantidad: " + cantidad_producto[i]);
			i++;
		}
	}
	
	public void reducir_inventario(String nombre, int cantidad)
	{
		int i = 0;
		
		while (i < nombre_producto.length)
		{
			if (nombre_producto[i] == nombre)
			{
				if (cantidad_producto[i] >= cantidad)
					cantidad_producto[i] -= cantidad;
				else
					System.out.println("No hay cantidad suficiente para vender");
				return;
			}
			i++;
		}
		System.out.println("No hay registrado ningun producto con ese nombre");
		return ;
	}
	
	public void registrar_producto(String nombre_producto, int cantidad_producto)
	{
		int i = 0;
		
		while (i < this.nombre_producto.length)
		{
			if (this.nombre_producto[i] == nombre_producto)
			{
				this.cantidad_producto[i] += cantidad_producto;
				return ;
			}
			i++;
		}
		this.nombre_producto = Arrays.copyOf(this.nombre_producto, i + 1);
		this.cantidad_producto = Arrays.copyOf(this.cantidad_producto, i + 1);
		
		this.nombre_producto[i] = nombre_producto;
		this.cantidad_producto[i] = cantidad_producto;
	}
	
	public int consultar_producto(String nombre)
	{
		int i = 0;
		
		while (i < nombre_producto.length)
		{
			if (nombre_producto[i] == nombre)
				return (cantidad_producto[i]);
			i++;
		}
		return (0);
	}
}