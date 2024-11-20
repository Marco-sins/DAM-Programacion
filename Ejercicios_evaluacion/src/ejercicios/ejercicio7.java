/*Un biologo esta realizando un estudio de distintas especies de invertebrados y 
 * necesita una aplicacion que le ayude a contabilizar el numero de patas que tiene en total 
 * todos los animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que 
 * escribas una aplicacion a la que hay que proporcionar :
 * -El numero de hormigas capturadas (6 patas)
 * -El numero de arañas capturadas (8 patas)
 * -El numero de cochinillas capturadas (14 patas)
 * La aplicacion debe mostrar el numero total de patas*/

package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la cantidad de hormigas capturadas: ");
		int horm = 6 * (scan.nextInt());
		System.out.println("Introduce la cantidad de arañas capturadas: ");
		int arañ = 8 * (scan.nextInt());
		System.out.println("Introduce la cantidad de cochinillas capturadas: ");
		int cochi = 14 * (scan.nextInt());
		int patas = horm + arañ + cochi;
		System.out.println("La cantidad de patas total es: " + patas);
	}
}