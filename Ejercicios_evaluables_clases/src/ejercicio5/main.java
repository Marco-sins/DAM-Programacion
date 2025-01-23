package ejercicio5;

public class main
{
	public static void main(String[] args)
	{
		Inventario in = new Inventario();
		
		in.registrar_producto("papa", 2);
		in.registrar_producto("tomate", 4);
		in.registrar_producto("queso", 3);
		in.registrar_producto("jamon", 5);
		in.registrar_producto("entrecot", 1);
		
		in.mostrar_inventario();
		in.consultar_producto("tomate");
		in.reducir_inventario("jamon", 4);
		in.mostrar_inventario();
		in.reducir_inventario("jamon", 3);
		
		double[] valor = {1.2, 3, 2.4, 4.5, 15.5};
		System.out.println(in.calcular_valor_total(valor));
	}
}