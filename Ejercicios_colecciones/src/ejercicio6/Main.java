package ejercicio6;

import java.util.ArrayList;
import java.util.Iterator;

/*Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna.*/

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
	}
}
