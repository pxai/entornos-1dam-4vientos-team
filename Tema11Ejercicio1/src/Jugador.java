/**
 * 
 */

/**
 * @author Iñaki Torres
 *
 */
public class Jugador {
	
	private String nombre;
	
	private String puesto;
	
	private int dorsal;
	/*
	 * Constructor
	 * @param nombre
	 * @param puesto
	 * @param dorsal
	 */
	public Jugador(String nombre, String puesto, int dorsal) {
		
		this.nombre = nombre;
		this.puesto = puesto;
		this.dorsal = dorsal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puesto=" + puesto + ", dorsal="
				+ dorsal + "]";
	}
	
}
