package ejercicios;

/*Una empresa que gestiona un parque acuatico te solicita una aplicacion 
que les ayude a calcular el importe que hay que cobrar el la taquilla por la compra de una serie de entradas 
(cuyo numero sera introducido por el usuario). Existen dos tpos de entradas : infantiles, que cuestam 15.50€, 
y de adultos que cuestan 20€.
en el caso de que el importe total sea igual o superior a 100€, se aplicara automaticamente un bono descuento del 5%*/

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		final float infantil = 15.50F;
		final int adulto = 20;
		final float descuento = 0.05F;
		System.out.println("Introduzca la cantidad de entradas infantiles desea");
		Scanner scan = new Scanner(System.in);
		int infa = scan.nextInt();
		System.out.println("Introduce la cantidad de entradas adultas desea");
		int adul = scan.nextInt();
		float precio = (infa * infantil) + (adul * adulto);
		boolean desc = precio >= 100 ? true : false;
		float total = desc ? (precio - (precio * descuento)) : precio;
		System.out.println("El importe total es: " + total + "€");
	}
}