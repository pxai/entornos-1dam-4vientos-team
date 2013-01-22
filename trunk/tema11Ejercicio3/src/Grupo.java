import java.util.Hashtable;


public class Grupo extends Hashtable<String,Alumno> {

	private String nombre;

	/**
	 * @param nombre
	 */
	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
