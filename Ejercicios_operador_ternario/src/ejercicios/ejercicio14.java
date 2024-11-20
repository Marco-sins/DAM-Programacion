package ejercicios;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el año de nacimiento");
		int i = scan.nextInt();
		boolean gensilen = i > 1928 && i < 1945 ? true : false;
		boolean genboomers = i > 1946 && i < 1964 ? true : false;
		boolean genx = i > 1965 && i < 1980 ? true : false;
		boolean geny = i > 1981 && i < 1996 ? true : false;
		boolean genz = i > 1997 && i < 2012 ? true : false;
		boolean genalpha = i > 2013 ? true : false;
		String msg = gensilen ? "Eres de la generacion silenciosa" : genboomers ? "Eres un baby boomer" : genx ? "Eres de la generacion x" : geny ? "Eres un millenials o de la generacion y" : genz ? "Eres de la generacion z" : genalpha ? "Eres de la generacion alpha" : "Introduce una fecha valida";
		System.out.println(msg);
	}
}