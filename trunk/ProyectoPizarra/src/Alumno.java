/**
 * 
 */

/**
 *
 * Clase que representa a un alumno
 *  
 * @author Pello Altadill
 */
public class Alumno {
	private String nombre;
	private String expediente;
	private int veces;
	
	/**
	 * Constructor con expediente y nombre, las veces se ponen a 0
	 * @param expediente
	 * @param nombre
	 */
	public Alumno(String nombre, String expediente) {
		this.nombre = nombre;
		this.expediente = expediente;
		veces = 0;
	}
	
	/**
	 * incrementa en uno las veces que ha salido el alumno a la pizarra
	 */
	public void incrementarVeces () {
		veces++;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [expediente=" + expediente + ", nombre=" + nombre
				+ ", veces=" + veces + "]\n";
	}

	/**
	 * @return the veces
	 */
	public int getVeces() {
		return veces;
	}
	/**
	 * @param veces the veces to set
	 */
	public void setVeces(int veces) {
		this.veces = veces;
	}
	/**
	 * @return the expediente
	 */
	public String getExpediente() {
		return expediente;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	
}
