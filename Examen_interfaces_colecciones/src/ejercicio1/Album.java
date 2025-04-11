package ejercicio1;

public class Album {
	private String titulo;
	private String artista;
	private String codigoAlbum;
	int anioLanzamiento;
	
	public Album(String titulo, String artista, String codigoAlbum, int anioLanzamiento) 
	{
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.codigoAlbum = codigoAlbum;
		this.anioLanzamiento = anioLanzamiento;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getCodigoAlbum() {
		return codigoAlbum;
	}
	
	public void setCodigoAlbum(String codigoAlbum) {
		this.codigoAlbum = codigoAlbum;
	}
	
	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}
	
	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}

	@Override
	public String toString() {
		return "Album [titulo=" + titulo + ", artista=" + artista + ", codigoAlbum=" + codigoAlbum
				+ ", anioLanzamiento=" + anioLanzamiento + "]\n";
	}
	
}
