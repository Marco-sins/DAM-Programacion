package ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{
		char[][] cod = ft_codificador();
		String str = ft_leer_texto();
		String codificado = ft_codificar(cod, str.toLowerCase());
		System.out.println(codificado);
		ft_escribir(codificado);
	}
	
	public static void ft_escribir(String str) 
	{
		BufferedWriter wr = null;
		
		try
		{
			wr = new BufferedWriter(new FileWriter("codificado.txt"));
			wr.write(str);
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage() + " Error");
		}
		finally
		{
			try
			{
				wr.close();
			}
			catch(Exception ex)
			{
				System.out.println("Error al cerrar el escribidor");
			}
		}
	}
	
	public static String ft_codificar(char[][] cod, String str)
	{
		String codificado = "";
		int i = 0;
		int j;
		while (i < str.length())
		{
			char c = str.charAt(i);
			j = 0;
			if (c == '\n')
			{
				codificado += "\n";
			}
			else if (c == ' ')
			{
				codificado += " ";
			}
			else
			{
				while (j < cod[0].length)
				{
					if (cod[0][j] == c)
					{
						codificado += cod[1][j];
					}
					j++;
				}
			}
			i++;
		}
		return (codificado);
	}
	
	public static String ft_leer_texto()
	{
		BufferedReader rd = null;
		String line;
		String str = "";
		
		try
		{
			rd = new BufferedReader(new FileReader("texto.txt"));
			line = rd.readLine();
			while (line != null)
			{
				str += line + "\n";
				line = rd.readLine();
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage() + " Error");
		}
		finally
		{
			try
			{
				rd.close();
			}
			catch (Exception ex)
			{
				System.out.println("Error al cerrar el archivo");
			}
		}
		return (str);
	}
	
	public static char[][] ft_codificador()
	{
		BufferedReader rd = null;
		String str;
		char[][] cod = new char[2][];
		String[] ar;
		
		try
		{
			rd = new BufferedReader(new FileReader("codec.txt"));
			str = rd.readLine();
			ar = str.split(" ");
			cod[0] = new char[ar[1].length()];
			for (int i = 0; i < ar[1].length(); i++)
			{
				cod[0][i] = ar[1].charAt(i);
			}
			str = rd.readLine();
			ar = str.split(" ");
			cod[1] = new char[ar[1].length()];
			for (int i = 0; i < ar[1].length(); i++)
			{
				cod[1][i] = ar[1].charAt(i);
			}
			for (int j = 0; j < cod.length; j++)
				System.out.println(Arrays.toString(cod[j]));
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage() + "Error");
		}
		finally
		{
			try
			{
				rd.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage() + "error");
			}
		}
		return (cod);
	}
}
