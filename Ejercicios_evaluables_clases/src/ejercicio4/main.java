package ejercicio4;

public class main
{
	public static void main(String[] args)
	{
		Sorteo sorteo = new Sorteo();
		
		sorteo.agregar_participante("a");
		sorteo.agregar_participante("b");
		sorteo.agregar_participante("c");
		sorteo.agregar_participante("d");
		sorteo.agregar_participante("e");
		sorteo.agregar_participante("f");
		sorteo.agregar_participante("g");
		sorteo.agregar_participante("h");
		sorteo.agregar_participante("i");
		sorteo.agregar_participante("j");
		
		sorteo.listar_participantes();
		sorteo.nombres_azar(4);
	}
}