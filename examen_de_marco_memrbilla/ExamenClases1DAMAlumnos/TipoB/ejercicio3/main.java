package ejercicio3;

public class main {
	public static void main(String[] args)
	{
		// Creo las variables ususuario dandoles el nombre
		Usuario usuarios = new Usuario(); 
		Usuario usuarios2 = new Usuario();
		usuarios.añadirUsuario("Pepe");
		usuarios2.añadirUsuario("Juan");
		
		// Muestro la cantidad de usuarios que hay llamando al metodo de los dos usuarios
		System.out.println(usuarios.getTotalUsuarios());
		System.out.println(usuarios2.getTotalUsuarios());
		
		// Creo otro usuario para ver si cambia
		Usuario usuarios3 = new Usuario();
		usuarios3.añadirUsuario("asd");
		
		// LLamo al metodo de otro usuario para ver si cambio
		System.out.println(usuarios.getTotalUsuarios());
	}
}
