/**
 * 
 */

/**
 * @author Enrico
 *
 */
public class Alumno {
	public String DNI;
	public String nombre;
	public String curso;
	/**
	 * @param dNI
	 * @param nombre
	 * @param curso
	 */
	public Alumno(String DNI, String nombre, String curso) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.curso = curso;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [DNI=" + DNI + ", nombre=" + nombre + ", curso=" + curso
				+ "]";
	}
	
	
}
