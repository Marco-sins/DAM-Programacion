package ejercicio3;

public class main
{
	public static void main(String[] args)
	{
		Estudiante e1 = new Estudiante("aa", 13, 5);
		Estudiante e2 = new Estudiante("ab", 14, 2);
		Estudiante e3 = new Estudiante("ac", 15, 4);
		Estudiante e4 = new Estudiante("ad", 16, 7);
		Estudiante e5 = new Estudiante("ae", 17, 6);
		Estudiante e6 = new Estudiante("af", 18, 8);
		Estudiante e7 = new Estudiante("ag", 19, 3);
		
		Estudiante[] ar_es = {e1, e2, e3, e4, e5, e6, e7};
		
		Estudiante e8 = new Estudiante("ba", 13, 5);
		Estudiante e9 = new Estudiante("bb", 14, 2);
		Estudiante e10 = new Estudiante("bc", 15, 4);
		Estudiante e11 = new Estudiante("bd", 16, 7);
		Estudiante e12 = new Estudiante("be", 17, 6);
		Estudiante e13 = new Estudiante("bf", 18, 8);
		Estudiante e14 = new Estudiante("bg", 19, 3);
		
		Estudiante[] ar_es2 = {e8, e9, e10, e11, e12, e13, e14};
		
		Clase c1 = new Clase("c1", 7, ar_es);
		Clase c2 = new Clase("c2", 7, ar_es2);
		
		Clase[] ar_cl = {c1, c2};
		Escuela escu = new Escuela(ar_cl, 2);
		
		c1.mostrar_estudiantes();
		Estudiante e15 = new Estudiante("cc", 14, 4);
		c1.agregar_estudiante(e15);
		c1.mostrar_estudiantes();
		System.out.println(c1.buscar_estudiante("cc"));
		c1.eliminar_estudiante(e15);
		c1.mostrar_estudiantes();
		
		System.out.println(escu.buscar_clase("c2"));
		escu.eliminar_clase(c2);
		System.out.println(escu.buscar_clase("c2"));
		escu.agregar_clase(c2);
		System.out.println(escu.buscar_clase("c2"));
		escu.mostrar_estadistica_por_clase();
		System.out.println(escu.buscar_estudiante_en_todas_las_clases("bc"));
	}
}