package ejercicio1;

public class Main {
	
	public static void main(String[] args)
	{
		Album a1 = new Album("t1", "a1", "c1", 2020);
		Album a2 = new Album("t2", "a2", "c2", 2021);
		Album a3 = new Album("t3", "a3", "c3", 2022);
		Album a4 = new Album("t4", "a4", "c4", 2023);
		Album a5 = new Album("t5", "a5", "c5", 2024);
		Album a6 = new Album("t1", "a1", "c1", 2020);
		
		GestionBibliotecaManual biblio = new GestionBibliotecaManual();
		biblio.agregarAlbum("g2", a2);
		biblio.agregarAlbum("g1", a1);
		biblio.agregarAlbum("g2", a5);
		biblio.agregarAlbum("g2", a4);
		biblio.agregarAlbum("g2", a3);
		biblio.agregarAlbum("g1", a6);
		
		biblio.listarAlbumes("g2");
		biblio.eliminarAlbum("g2", "c2");
		biblio.eliminarAlbum("g1", "c1");
		biblio.listarAlbumes("g2");
		biblio.listarAlbumes("g1");
		
		biblio.actualizarAlbum("g2", "c3", "T3");
		biblio.listarAlbumes("g2");
		
		System.out.println(biblio.buscarAlbum("g2", "c3").toString());
		biblio.eliminarAlbum("g2", "c3");
		try
		{
			System.out.println(biblio.buscarAlbum("g2", "c3").toString());
		}
		catch (Exception ex)
		{
			
		}
	}
}
