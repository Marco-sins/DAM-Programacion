package ejercicio1;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main 
{
	public static void main(String[] argas)
	{
		Scanner scan = new Scanner(System.in);
		String nombre;
		String edad;
		BufferedWriter w = null;
		System.out.println("Ingrese su nombre");
		nombre = scan.nextLine();
		System.out.println("Ingrese su edad");
		edad = scan.nextLine();
		
		try
		{
			w = new BufferedWriter(new FileWriter("datos.txt", true));
			w.write("Nombre: " + nombre);
			w.newLine();
			w.write("Edad: " + edad);
			w.newLine();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally 
		{
			try
			{
				scan.close();
				w.close();				
			}
			catch (Exception ex)
			{
				System.out.println("No se ha podido cerrar el archivo");
			}
		}
	}
}
