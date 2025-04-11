package test;

import biblioteca.Biblioteca;
import static org.junit.jupiter.api.Assertions.*;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class Biblioteca_test 
{
	
	// Ejecucion del tester JUnit
	
	// Se comprueba si la funcion es correcta pasandole como parametros al assertEquals(ResultadoEsperado, LlamadaALaFuncion)
	@Test
	public void test_ft_bisiesto()
	{
		Biblioteca bisiesto = new Biblioteca();
		try
		{
			assertEquals(true, bisiesto.ft_bisiesto());
		}
		catch (DateTimeException e) // Si no detecta ninguna excepcion no realiza la cobertura de codigo en esta parte.
		{
			assertEquals(false, false);
		}
	}
	
	@Test
	public void test_ft_30_dias_despues()
	{
		Biblioteca a = new Biblioteca();
		LocalDate b = LocalDate.of(2010, 03, 22);
		assertEquals(b, a.ft_30_dias_despues());
	}
	
	@Test
	public void test_ft_1_mes_despues()
	{
		Biblioteca a = new Biblioteca();
		LocalDate b = LocalDate.of(2010, 01, 15);
		assertEquals(b, a.ft_1_mes_despues());
	}
	
	@Test
	public void test_ft_1_mes_depues2()
	{
		Biblioteca a = new Biblioteca();
		LocalDate b = LocalDate.of(2022, 12, 12);
		assertEquals(b, a.ft_1_mes_despues2());
	}
	
	@Test
	public void test_ft_dia_de_la_semana()
	{
		Biblioteca a = new Biblioteca();
		DayOfWeek b = DayOfWeek.of(5);
		assertEquals(b, a.ft_dia_de_la_semana());
	}
	
	@Test
	public void test_ft_dia_de_la_semana_3_dias_antes()
	{
		Biblioteca a = new Biblioteca();
		DayOfWeek b = DayOfWeek.of(5);
		assertEquals(b, a.ft_dia_de_la_semana_3_dias_antes());
	}
	
	@Test
	public void test_ft_dia_de_la_semana_primer_dia_de_octubre()
	{
		Biblioteca a = new Biblioteca();
		DayOfWeek b = DayOfWeek.of(2);
		assertEquals(b, a.ft_dia_de_la_semana_primer_dia_de_octubre());
	}
	
	@Test
	public void test_ft_segundos()
	{
		Biblioteca a = new Biblioteca();
		assertEquals(8100, a.ft_segundos());
	}
}
