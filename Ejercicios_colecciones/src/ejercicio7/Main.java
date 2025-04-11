package ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;

/*Modifica el programa anterior de tal forma que las cartas se muestren orde-
nadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.*/

public class Main {

	public static void main(String[] args)
	{
		String[] palo = {"bastos", "monedas", "copas", "espadas"};
		int[] valor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ArrayList<Carta> list = new ArrayList<Carta>();
		Iterator<Carta> it;
		int pos_palo;
		int pos_valor;
		boolean repe;
		
		while (list.size() < 10)
		{
			repe = false;
			pos_palo = (int) (Math.random() * 4);
			pos_valor = (int) (Math.random() * 10);
			Carta carta = new Carta(palo[pos_palo], valor[pos_valor]);
			it = list.iterator();
			while (it.hasNext())
			{
				Carta cart = it.next();
				if (cart.getPalo().equals(carta.getPalo()) && cart.getTipo() == carta.getTipo())
						repe = true;
			}
			if (!repe)
				list.add(carta);
		}
		System.out.println(list.toString());
		
		ArrayList<Carta> list2 = new ArrayList<Carta>();
		
	}
}
