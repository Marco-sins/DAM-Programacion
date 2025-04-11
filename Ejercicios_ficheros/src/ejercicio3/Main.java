package ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args)
	{
		BufferedReader rd = null;
		String[] ar;
		String str;
		int total = 0;
		int lineas = 0;
		int palabras = 0;
		
		try
		{
			rd = new BufferedReader(new FileReader("carta.txt"));
			str = rd.readLine();
			while (str != null)
			{
				ar = str.split(" ");
				palabras += ar.length;
				for (int i = 0; i < ar.length; i++)
				{
					total += ar[i].length();
				}
				str = rd.readLine();
				lineas++;
				
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage() + "error");
		}
		finally
		{
			try
			{
				rd.close();
			}
			catch (Exception ex)
			{
				System.out.println(ex.getMessage() + "Error");
			}
		}
		System.out.println("Caracteres: " + total);
		System.out.println("Palabras: " + palabras);
		System.out.println("Lineas: " + lineas);
	}
}
