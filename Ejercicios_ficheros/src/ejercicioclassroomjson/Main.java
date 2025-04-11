package ejercicioclassroomjson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args)
	{
		Gson gson = new Gson();		
		Academico academico = new Academico("Zape", 2024);
		Academico academico2 = new Academico("Zipi", 2024);
		String json = gson.toJson(academico);
		List<Academico> list = new ArrayList<Academico>();
		list.add(academico);
		list.add(academico2);
		System.out.println(json);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Datos_academico.json")))
		{
			bw.write(json);
			System.out.println("Fichero creado");
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}	
		
		String fichero = "";
		try (BufferedReader bw = new BufferedReader(new FileReader("Datos_academico.json")))
		{
			String linea;
			while ((linea = bw.readLine()) != null)
			{
				fichero += linea;
			}
			System.out.println("Fichero leido");
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		Properties prop = gson.fromJson(fichero, Properties.class);
		System.out.println("Nombre: " + prop.get("nombre"));
		System.out.println("Año de ingreso: " + prop.get("anioIngreso"));
		
		ClubAcademicos club = new ClubAcademicos(list, "DAMN", 2);
		String json2 = gson.toJson(club);
		System.out.println(json2);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Datos_club_academico.json")))
		{
			bw.write(json2);
			System.out.println("Fichero creado");
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		String fichero2 = "";
		try (BufferedReader bw = new BufferedReader(new FileReader("Datos_club_academico.json")))
		{
			String linea;
			while ((linea = bw.readLine()) != null)
			{
				fichero2 += linea;
			}
			System.out.println("Fichero leido");
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		ClubAcademicos club1 = gson.fromJson(fichero2, ClubAcademicos.class);
		System.out.println(club1);
	}
}
