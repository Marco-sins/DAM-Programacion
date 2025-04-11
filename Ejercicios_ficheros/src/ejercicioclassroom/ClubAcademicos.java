package ejercicioclassroom;

import java.util.List;

public class ClubAcademicos {
	private List<Academico> listado;
	private String nombreClub;
	private int numMiembros;
	public ClubAcademicos() {
		super();
	}
	public ClubAcademicos(List<Academico> listado, String nombreClub, int numMiembros) {
		super();
		this.listado = listado;
		this.nombreClub = nombreClub;
		this.numMiembros = numMiembros;
	}
	public List<Academico> getListado() {
		return listado;
	}
	public void setListado(List<Academico> listado) {
		this.listado = listado;
	}
	public String getNombreClub() {
		return nombreClub;
	}
	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}
	public int getNumMiembros() {
		return numMiembros;
	}
	public void setNumMiembros(int numMiembros) {
		this.numMiembros = numMiembros;
	}
	@Override
	public String toString() {
		return "ClubAcademicos [listado=" + listado + ", nombreClub=" + nombreClub + ", numMiembros=" + numMiembros
				+ "]";
	}

}