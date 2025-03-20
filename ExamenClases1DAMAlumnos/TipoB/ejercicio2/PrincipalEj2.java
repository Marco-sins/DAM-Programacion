package ejercicio2;

public class PrincipalEj2 {

	public static void main(String[] args) {
		PlataformaPeliculas e=new PlataformaPeliculas();
		e.registrarPelicula("El 47");
		e.registrarPelicula("It");
		e.registrarPelicula("Love Actually");
		System.out.println(e);
		int consultarEspacio = e.consultarEspacio();
		System.out.println("Hay "+consultarEspacio+ " vacios");
		e.mostrarPeliculasAlmacenadas();
		String busqueda1 = e.buscarPelicula("Blancanieves y los 7 enanitos");
		System.out.println(busqueda1);
		String busqueda2 = e.buscarPelicula("Love Actually");
		System.out.println(busqueda2);
		e.eliminarPelicula("It");
		System.out.println(e);

	}

}
