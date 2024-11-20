package Ejercicios;

import java.util.Scanner;

public class Ejercicio3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String frase = "la felicidad no brota de la razon, sino de la imaginacion";
		String frase_oculta = "** ********* ** ***** ** ** *****, **** ** ** ***********";
		String refran = "quien siembra vientos, recoge tempestades";
		String refran_oculto = "***** ******* *******, ****** ***********";
		String cancion = "yo me mantengo con el alma en vela";
		String cancion_oculta = "** ** ******** *** ** **** ** ****";
		String comida = "ensalada de rucula, queso feta y tomate";
		String comida_oculta = "******** ** ******, ***** **** * ******";
		String result = "";
		String usuario = "";
		boolean p = false;
		int random;
		int i;
		int dinero;
		int total;
		
		random = (int) (Math.random() * 4 + 1);
		dinero = 0;
		total = 0;
		i = 0;
		if (random == 1)
		{
			System.out.println("La frase va a ser una frase célebre");
			System.out.println("Tu frase a adivinar: " + frase_oculta);
			dinero = (int) (Math.random() * 225) + 25;
			while (i == 0)
			{
				System.out.println("¿Qué letra eliges por " + dinero + "€ ?");
				usuario = scan.next();
				if ((usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u') && total < 50)
					System.out.println("No puede introducir una vocal porque le falta dinero");
				else
					i = 1;
			}
			while (!usuario.equals("-1") && !p)
			{
				p = true;
				for (i = 0; i <= frase.length() - 1; i++)
				{
					if (usuario.charAt(0) == frase.charAt(i))
					{
						result += usuario.charAt(0);
						if (usuario.charAt(0) != 'a' && usuario.charAt(0) != 'e' && usuario.charAt(0) != 'i' && usuario.charAt(0) != 'o' && usuario.charAt(0) != 'u' )
							total += dinero;
					}
					else
					{
						result += frase_oculta.charAt(i);
						if (frase_oculta.charAt(i) == '*')
							p = false;
					}
				}
				if (usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u' )
				{
					System.out.println("Has elegido una vocal, se te descontaran 50€");
					total -= 50;
				}
				System.out.println("Dinero acumulado: " + total + "€");
				System.out.println("Así se queda la frase: " + result);
				dinero = (int) (Math.random() * 225) + 25;
				i = 0;
				while (i == 0)
				{
					System.out.println("¿Qué letra eliges por " + dinero + "€ ?");
					usuario = scan.next();
					if ((usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u') && total < 50)
						System.out.println("No puede introducir una vocal porque le falta dinero");
					else
						i = 1;
				}
				frase_oculta = result;
				result = "";
			}
		}
		if (random == 2)
		{
			System.out.println("La frase va a ser una refran");
			System.out.println("Tu frase a adivinar: " + refran_oculto);
			dinero = (int) (Math.random() * 225) + 25;
			while (i == 0)
			{
				System.out.println("¿Qué letra eliges por " + dinero + "€ ?");
				usuario = scan.next();
				if ((usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u') && total < 50)
					System.out.println("No puede introducir una vocal porque le falta dinero");
				else
					i = 1;
			}
			while (!usuario.equals("-1") && !p)
			{
				p = true;
				for (i = 0; i <= refran.length() - 1; i++)
				{
					if (usuario.charAt(0) == refran.charAt(i))
					{
						result += usuario.charAt(0);
						if (usuario.charAt(0) != 'a' || usuario.charAt(0) != 'e' || usuario.charAt(0) != 'i' || usuario.charAt(0) != 'o' || usuario.charAt(0) != 'u' )
							total += dinero;
					}
					else
					{
						result += refran_oculto.charAt(i);
						if (refran_oculto.charAt(i) == '*')
							p = false;
					}
				}
				if (usuario.charAt(0) == 'a' && usuario.charAt(0) == 'e' && usuario.charAt(0) == 'i' && usuario.charAt(0) == 'o' && usuario.charAt(0) == 'u' )
				{
					System.out.println("Has elegido una vocal, se te descontaran 50€");
					total -= 50;
				}
				System.out.println("Dinero acumulado: " + total + "€");
				System.out.println("Así se queda la frase: " + result);
				dinero = (int) (Math.random() * 225) + 25;
				i = 0;
				while (i == 0)
				{
					System.out.println("¿Qué letra eliges por " + dinero + "€ ?");
					usuario = scan.next();
					if ((usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u') && total < 50)
						System.out.println("No puede introducir una vocal porque le falta dinero");
					else
						i = 1;
				}
				refran_oculto = result;
				result = "";
			}
		}
		if (random == 3)
		{
			System.out.println("La frase va a ser de una canción");
			System.out.println("Tu frase a adivinar: " + cancion_oculta);
			dinero = (int) (Math.random() * 225) + 25;
			while (i == 0)
			{
				System.out.println("¿Qué letra eliges por " + dinero + "€ ?");
				usuario = scan.next();
				if ((usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u') && total < 50)
					System.out.println("No puede introducir una vocal porque le falta dinero");
				else
					i = 1;
			}
			while (!usuario.equals("-1") && !p)
			{
				p = true;
				for (i = 0; i <= cancion.length() - 1; i++)
				{
					if (usuario.charAt(0) == cancion.charAt(i))
					{
						result += usuario.charAt(0);
						if (usuario.charAt(0) != 'a' && usuario.charAt(0) != 'e' && usuario.charAt(0) != 'i' && usuario.charAt(0) != 'o' && usuario.charAt(0) != 'u' )
							total += dinero;
					}
					else
					{
						result += cancion_oculta.charAt(i);
						if (cancion_oculta.charAt(i) == '*')
							p = false;
					}
				}
				if (usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u' )
				{
					System.out.println("Has elegido una vocal, se te descontaran 50€");
					total -= 50;
				}
				System.out.println("Dinero acumulado: " + total + "€");
				System.out.println("Así se queda la frase: " + result);
				dinero = (int) (Math.random() * 225) + 25;
				i = 0;
				while (i == 0)
				{
					System.out.println("¿Qué letra eliges por " + dinero + "€ ?");
					usuario = scan.next();
					if ((usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u') && total < 50)
						System.out.println("No puede introducir una vocal porque le falta dinero");
					else
						i = 1;
				}
				cancion_oculta = result;
				result = "";
			}
		}
		if (random == 4)
		{
			System.out.println("La frase va a ser de una comida");
			System.out.println("Tu frase a adivinar: " + comida_oculta);
			dinero = (int) (Math.random() * 225) + 25;
			while (i == 0)
			{
				System.out.println("¿Qué letra eliges por " + dinero + "€ ?");
				usuario = scan.next();
				if ((usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u') && total < 50)
					System.out.println("No puede introducir una vocal porque le falta dinero");
				else
					i = 1;
			}
			while (!usuario.equals("-1") && !p)
			{
				p = true;
				for (i = 0; i <= comida.length() - 1; i++)
				{
					if (usuario.charAt(0) == comida.charAt(i))
					{
						result += usuario.charAt(0);
						if (usuario.charAt(0) != 'a' && usuario.charAt(0) != 'e' && usuario.charAt(0) != 'i' && usuario.charAt(0) != 'o' && usuario.charAt(0) != 'u' )
							total += dinero;
					}
					else
					{
						result += comida_oculta.charAt(i);
						if (comida_oculta.charAt(i) == '*')
							p = false;
					}
				}
				if (usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u' )
				{
					System.out.println("Has elegido una vocal, se te descontaran 50€");
					total -= 50;
				}
				System.out.println("Dinero acumulado: " + total + "€");
				System.out.println("Así se queda la frase: " + result);
				dinero = (int) (Math.random() * 225) + 25;
				i = 0;
				while (i == 0)
				{
					System.out.println("¿Qué letra eliges por " + dinero + "€ ?");
					usuario = scan.next();
					if ((usuario.charAt(0) == 'a' || usuario.charAt(0) == 'e' || usuario.charAt(0) == 'i' || usuario.charAt(0) == 'o' || usuario.charAt(0) == 'u') && total < 50)
						System.out.println("No puede introducir una vocal porque le falta dinero");
					else
						i = 1;
				}
				comida_oculta = result;
				result = "";
			}
		}
		System.out.println("El dinero total ganado es: " + total);
		System.out.println("Adiós");
	}
}