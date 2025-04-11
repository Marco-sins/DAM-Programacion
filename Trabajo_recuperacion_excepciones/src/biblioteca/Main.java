package biblioteca;

import java.time.DateTimeException;

public class Main {
	public static void main(String[] args) {
		
		// Comprobacion del codigo numerados del 1 al 8
		
		// 1
		try 
		{
			System.out.println("1: " + Biblioteca.ft_bisiesto());
		} 
		catch (DateTimeException e)
		{
			System.out.println("Has introducido mal la fecha");
		}
		

		// 2
		try 
		{
			System.out.println("2: " + Biblioteca.ft_30_dias_despues());
		} 
		catch (DateTimeException e) 
		{
			System.out.println("Has intruducido mal la fecha");
		}

		// 3
		try
		{
			System.out.println("3: " + Biblioteca.ft_1_mes_despues());
		}
		catch (DateTimeException e)
		{
			System.out.println("Has introducido mal la fecha");
		}

		// 4
		try
		{
			System.out.println("4: " + Biblioteca.ft_1_mes_despues2());
		}
		catch (DateTimeException e)
		{
			System.out.println("Has introducido mal la fecha");
		}

		// 5
		try
		{
			System.out.println("5: " + Biblioteca.ft_dia_de_la_semana());
		}
		catch (DateTimeException e)
		{
			System.out.println("Has introducido mal la fecha");
		}

		// 6
		try
		{
			System.out.println("6: " + Biblioteca.ft_dia_de_la_semana_3_dias_antes());
		}
		catch (DateTimeException e)
		{
			System.out.println("Has introducido mal la fecha");
		}

		// 7
		try
		{
			System.out.println("7: " + Biblioteca.ft_dia_de_la_semana_primer_dia_de_octubre());
		}
		catch (DateTimeException e)
		{
			System.out.println("Has introducido mal la fecha");
		}

		// 8
		try
		{
			System.out.println("8: " + Biblioteca.ft_segundos());
		}
		catch (ArithmeticException e)
		{
			System.out.println("Ha ocurrido un error aritmetico");
		}
		catch (DateTimeException e)
		{
			System.out.println("Has introducido mal la fecha");
		}
	}
}