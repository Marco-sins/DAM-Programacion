package ejercicios;

import java.util.Scanner;

public class ejercicio26 {
	public static void main(String[] args) {
		final float iva = 0.21F;
		final float iva_red = 0.1F;
		final float iva_superred = 0.04F;
		final String nopro = "nopro";
		final String mitad = "mitad";
		final String menos5 = "menos5";
		final String porc5 = "5porc";
		float precio;
		String tipo_iva;
		String tipo_descuento;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el importe del artículo");
		precio = scan.nextFloat();
		System.out.println("Introduzca tipo de IVA(general, reducido o superreducido");
		tipo_iva = scan.next();
		System.out.println("Introduce el código promocional (nopro, mitad, meno5 o 5porc");
		tipo_descuento = scan.next();
		float iva_aplicar = tipo_iva.equals("general") ? iva : (tipo_iva.equals("reducido") ? iva_red : iva_superred);
		float precio_con_iva = precio + (iva_aplicar * precio);
		float precio_total = tipo_descuento.equals("nopro") ? precio_con_iva : 
				(float) (tipo_descuento.equals("mitad") ? precio_con_iva / 2 : (tipo_descuento.equals("meno5") ? 
						(precio_con_iva - 5) : precio_con_iva - (precio_con_iva * 0.05)));
		System.out.println(precio_total);
	}
}