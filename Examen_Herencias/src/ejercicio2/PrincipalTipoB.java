package ejercicio2;

public class PrincipalTipoB {

	public static void main(String[] args) {
		
            // Crear videoclub con capacidad para 5 películas
            Videoclub videoclub = new Videoclub(5);

            // Agregar películas
            Pelicula p1 = new Estreno("E001", "Avengers", "Joss Whedon", 143, "acción");
            Pelicula p2 = new Estreno("E002", "Superbad", "Greg Mottola", 113, "comedia");
            Pelicula p3 = new Clasica("C001", "Casablanca", "Michael Curtiz", 102, 1942);

            videoclub.agregarPelicula(p1);
            videoclub.agregarPelicula(p2);
            videoclub.agregarPelicula(p3);

            // Consultar disponibilidad
            videoclub.consultarDisponibilidad("E001");

            // Alquilar película
            videoclub.alquilarPelicula("E001");

            // Intentar alquilar de nuevo (debe lanzar excepción)
           
                videoclub.alquilarPelicula("E001");
           

            // Devolver película con retraso y calcular recargo
            videoclub.devolverPelicula(p1, 3, false);

            // Consultar disponibilidad después de la devolución
            videoclub.consultarDisponibilidad("E001");

       
    
	}
}
