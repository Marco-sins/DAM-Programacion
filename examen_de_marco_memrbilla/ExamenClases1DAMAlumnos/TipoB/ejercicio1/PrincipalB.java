package ejercicio1;

import java.util.Arrays;

public class PrincipalB {

	public static void main(String[] args) 
	{
		Plato c = new Plato("queso","Entrada",8.5f);
		Plato c1 = new Plato("fresas","Postre",4.5f);
		Plato c2 = new Plato("chuletas","Principal",12);
		Menu p = new Menu();
		p.anadirPlato(c);
		p.anadirPlato(c1);
		p.anadirPlato(c2);
		p.anadirPlato(c);
		System.out.println(p);
		System.out.println(Arrays.toString(p.generarPlatosAleatorios(4)));
		System.out.println(Arrays.toString(p.generarListaPorTipo("Entrada", 3)));
		System.out.println(Arrays.toString(p.generarListaPorTipo("Postre", 2)));
	}
}
