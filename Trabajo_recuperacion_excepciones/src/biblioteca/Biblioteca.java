package biblioteca;

import java.time.*;

public class Biblioteca
{
	// 1
	// Funcion que mira de forma manual si el anio es bisiesto comprobando si en el año esta en 29 de febrero
	public static boolean ft_bisiesto()
	{
			if (LocalDate.of(2020, 02, 29) == null)
				return (false);
			else
				return (true);		
	}
	
	// 2
	// Funcion que le suma 30 dias a una fecha que se introduce de forma manual en la funcion
	public static LocalDate ft_30_dias_despues ()
	{
		LocalDate day = LocalDate.of(2010, 02, 20).plusDays(30);
		return (day); 
	}
	
	// 3
	// Funcion que te devuelve el mes siguiente de la fecha que se le pone de forma manual
	public static LocalDate ft_1_mes_despues()
	{
		LocalDate day = LocalDate.of(2009, 12, 15).plusMonths(1);
		return (day);
	}
	
	// 4
	// Funcion identica a la anterior, te devuelve el mes siguiente de la fecha que se le pone de forma manual
	public static LocalDate ft_1_mes_despues2()
	{
		LocalDate day = LocalDate.of(2022, 11, 12).plusMonths(1);
		return (day);
	}
	
	// 5
	// Funcion que te devuelve el dia de la semana de la fecha indicada 
	public static DayOfWeek ft_dia_de_la_semana()
	{
		LocalDate day = LocalDate.of(2022, 4, 22);
		DayOfWeek dayw = day.getDayOfWeek();
		return (dayw);
	}
	
	// 6
	// Funcion que te devuelve el dia de la semana de 3 dias anterior al de hoy
	public static DayOfWeek ft_dia_de_la_semana_3_dias_antes()
	{
		LocalDate today = LocalDate.now().minusDays(3);
		DayOfWeek dayw = today.getDayOfWeek();
		return (dayw);
	}
	
	// 7
	// Funcion que te devuelve el primer dia de la semana de octubre de 1940
	public static DayOfWeek ft_dia_de_la_semana_primer_dia_de_octubre()
	{
		LocalDate day = LocalDate.of(1940, 10, 1);
		DayOfWeek dayw = day.getDayOfWeek();
		return (dayw);
	}
	
	// 8
	// Funcion que devuelve la cantidad de segundos que pasan entre dos horas introducidas manualmente
	public static int ft_segundos()
	{
		int hora1 = 10;
		int minutos1 = 15;
		int hora2 = 12;
		int minutos2 = 30;
		int segundos1 = 0;
		int segundos2 = 0;
		int segundostotales;
		
		if (segundos2 > segundos1)
		{
			minutos1--;
			if (minutos2 > minutos1)			// Se mira si hay que hacer calculos de mas
			{
				hora1--;
			}
		}
		segundostotales = ((hora2 - hora1) * 3600 + (minutos2 - minutos1) * 60);
		return (segundostotales);
	}
}