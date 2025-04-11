package ejercicioclassroom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement (name="Academico")
@XmlType (propOrder = {"Nombre", "AnioIngreso"})
@XmlAccessorType (XmlAccessType.FIELD)
public class Academico {
	@XmlElement (name = "Nombre")
	private String nombre;
	@XmlElement (name = "Ingreso")
	private int anioIngreso;
	
	public Academico(String nombre, int anioIngreso) {
		super();
		this.nombre = nombre;
		this.anioIngreso = anioIngreso;
	}

	public Academico()
	{
		super();
	}
	
	@Override
	public String toString() {
		return "Academico [nombre=" + nombre + ", anioIngreso=" + anioIngreso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	
}