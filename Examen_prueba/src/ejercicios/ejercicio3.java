package ejercicios;

import java.util.Scanner;

public class ejercicio3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenido al supermercado online");
		System.out.println("Estos son los productos que ofertamos");
		System.out.println("Conservas");
		System.out.println("1.Atún en lata. Precio: 2€");
		System.out.println("2.Berberechos. Precio: 1,5€");
		System.out.println("3.Corazones de alcachofas. Precio: 3,45€");
		System.out.println("Lácteos");
		System.out.println("4.Yogurts. Precio: 2,95€");
		System.out.println("5.Flan. Precio: 3€");
		System.out.println("6.Natillas. Precio: 2€");
		System.out.println("Productos de limpieza");
		System.out.println("7.Lejía. Precio: 5€");
		System.out.println("8.Detergente lavadora. Precio: 8€");
		System.out.println("9.Limpiador de cristales. Precio: 1,85€");
		System.out.println("10.Fregasuelos. Precio: 1€");
		System.out.println("Para terminar pulse 0");
		double total = 0;
		double descuento = 0;
		double incremento = 0;
		double precio_atun = 2;
		double precio_berberecho = 1.5;
		double precio_corazones = 3.45;
		double precio_yogurt = 2.95;
		double precio_flan = 3;
		double precio_natilla = 2;
		double precio_lejia = 5;
		double precio_detergente = 8;
		double precio_limpiador = 1.85;
		double precio_fregasuelo = 1;
		int atun = 0;
		int berberecho = 0;
		int corazones = 0;
		int yogurt = 0;
		int flan = 0;
		int natilla = 0;
		int lejia = 0;
		int detergente = 0;
		int limpiador = 0;
		int fregasuelo = 0;
		System.out.println("Ingrese un producto con el numero que esta asignado");
		int compra = scan.nextInt();
		while (compra != 0)
		{
			if (compra == 1)
			{
				System.out.println("Atún en lata. Ingrese cuanto desea: ");
				atun = scan.nextInt();
			}
			else if (compra == 2)
			{
				System.out.println("Berberechos. Ingrese cuanto desea: ");
				berberecho = scan.nextInt();
			}
			else if (compra == 3)
			{
				System.out.println("Corazones de alcachofas. Ingrese cuanto desea: ");
				corazones = scan.nextInt();
			}
			else if (compra == 4)
			{
				System.out.println("Yogurt. Ingrese cuanto desea: ");
				yogurt = scan.nextInt();
			}
			else if (compra == 5)
			{
				System.out.println("Flan. Ingrese cuanto desea: ");
				flan = scan.nextInt();
			}
			else if (compra == 6)
			{
				System.out.println("Natilla. Ingrese cuanto desea: ");
				natilla = scan.nextInt();
			}
			else if (compra == 7)
			{
				System.out.println("Lejía. Ingrese cuanto desea: ");
				lejia = scan.nextInt();
			}
			else if (compra == 8)
			{
				System.out.println("Detergente lavadora. Ingrese cuanto desea: ");
				detergente = scan.nextInt();
			}
			else if (compra == 9)
			{
				System.out.println("Limpiador de cristales. Ingrese cuanto desea: ");
				limpiador = scan.nextInt();
			}
			else if (compra == 10)
			{
				System.out.println("Fregasuelos. Ingrese cuanto desea: ");
				fregasuelo = scan.nextInt();
			}
			else
				System.out.println("Error al ingresar el producto");
			System.out.println("Ingrese otro producto con el numero que esta asignado o 0 si desea terminar");
			compra = scan.nextInt();
		}
		System.out.println("Ticket");
		if (atun != 0)
		{
			incremento = atun * precio_atun;
			total += incremento;
			System.out.println(atun + " Atún en lata: " + incremento + "€");
		}
		if (berberecho != 0)
		{
			incremento = berberecho * precio_berberecho;
			total += incremento;
			System.out.println(berberecho + " Berberechos: " + incremento + "€");
		}
		if (corazones != 0)
		{
			incremento = corazones * precio_corazones;
			total += incremento;
			System.out.println(corazones + " Corazones de alcachofas: " + incremento + "€");
		}
		if (yogurt != 0)
		{
			incremento = yogurt * precio_yogurt;
			total += incremento;
			System.out.println(yogurt + " Yogurt: " + incremento + "€");
		}
		if (flan != 0)
		{
			incremento = flan * precio_flan;
			total += incremento;
			System.out.println(flan + " Flan: " + incremento + "€");
		}
		if (natilla != 0)
		{
			incremento = natilla * precio_natilla;
			total += incremento;
			System.out.println(natilla + " Natillas: " + incremento + "€");
		}
		if (lejia != 0)
		{
			if (lejia >= 2)
			{
				descuento = ((lejia * precio_lejia) * 0.20);
				incremento = (lejia * precio_lejia) - descuento;
			}
			else
				incremento = lejia * precio_lejia;
			total += incremento;
			System.out.println(lejia + " Lejía: " + incremento + "€");
		}
		if (detergente != 0)
		{
			if (detergente >= 2)
			{
				descuento = ((detergente * precio_detergente) * 0.20);
				incremento = (detergente * precio_detergente) - descuento;
			}
			else
				incremento = detergente * precio_detergente;
			total += incremento;
			System.out.println(detergente + " Detergente lavadora: " + incremento + "€");
		}
		if (limpiador != 0)
		{
			if (limpiador >= 2)
			{
				descuento = ((limpiador * precio_limpiador) * 0.20);
				incremento = (limpiador * precio_limpiador) - descuento;
			}
			else
				incremento = limpiador * precio_limpiador;
			total += incremento;
			System.out.println(limpiador + " Limpiador de cristales: " + incremento + "€");
		}
		if (fregasuelo != 0)
		{
			if (fregasuelo >= 2)
			{
				descuento = ((fregasuelo * precio_fregasuelo) * 0.20);
				incremento = (fregasuelo * precio_fregasuelo) - descuento;
			}
			else
				incremento = fregasuelo * precio_fregasuelo;
			total += incremento;
			System.out.println(fregasuelo + " Fregasuelos: " + incremento + "€");
		}
		System.out.println("Precio total sin gastos de envio: " + total + "€");
		System.out.println("Descuento: " + descuento + "€");
		if (total == 0)
			System.out.println("No hay gasto de envio porque no se ha pedido nada");
		else if (total < 20)
		{
			System.out.println("Los gastos de envio son: 5.95€");
			total += 5.95;
		}
		else if (total >= 20 && total < 50)
		{
			System.out.println("Los gastos de envio son: 2.95€");
			total += 2.95;
		}
		else if (total >= 50)
			System.out.println("Los gastos de envio son gratis");
		System.out.println("El precio total incluyendo los gastos de envio es: " + total);
	}
}