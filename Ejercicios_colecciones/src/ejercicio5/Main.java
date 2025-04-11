package ejercicio5;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		double[] cant= {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2};
		String[] tipo = {"cara", "cruz"};
		ArrayList<Moneda> list = new ArrayList<Moneda>();
		int pos_cant;
		int pos_tipo;
		
		while (list.size() < 6)
		{
			if (list.isEmpty())
			{
				pos_cant = (int)(Math.random() * 8);
				pos_tipo = (int) (Math.random() * 2);
				Moneda m = new Moneda(cant[pos_cant], tipo[pos_tipo]);
				list.add(m);
			}
			else
			{
				Moneda last_money = list.get(list.size() - 1);
				pos_cant = (int)(Math.random() * 8);
				pos_tipo = (int) (Math.random() * 2);
				Moneda m = new Moneda(cant[pos_cant], tipo[pos_tipo]);
				if (m.getCant() == last_money.getCant() || m.getTipo().equals(last_money.getTipo()))
				{
					list.add(m);
				}
			}
		}
		System.out.println(list.toString());
	}
}
