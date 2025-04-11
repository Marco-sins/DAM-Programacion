package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main 
{
	public static void main(String[] args)
	{
		BufferedReader rd = null;
		BufferedReader rd2 = null;
		BufferedWriter w = null;
		List<Integer> list = new ArrayList<Integer>();
		
		try
		{
			rd = new BufferedReader(new FileReader("file1.txt"));
			rd2 = new BufferedReader(new FileReader("file2.txt"));
			String line = rd.readLine();
			Integer n = Integer.valueOf(line);
			while (line != null)
			{
				list.add(n);
				line = rd.readLine();
				n = Integer.valueOf(line);
			}
			line = rd2.readLine();
			n = Integer.valueOf(line);
			while (line != null)
			{
				list.add(n);
				line = rd2.readLine();
				n = Integer.valueOf(line);
			}
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
				rd2.close();
			}
			catch (Exception ex)
			{
				System.out.println("Error al cerrar el lector");
				System.out.println(ex.getMessage());
			}
		}
		Collections.sort(list);
		try
		{
			w = new BufferedWriter(new FileWriter("file3.txt"));
			Iterator<Integer> it = list.iterator();
			
			while (it.hasNext())
			{
				String n = it.next().toString();
				w.write(n + "\n");
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage() + "Error");
		}
		finally
		{
			try
			{
				w.close();
			}
			catch (Exception ex)
			{
				System.out.println(ex.getMessage() + "Error");
			}
		}
	}
}
