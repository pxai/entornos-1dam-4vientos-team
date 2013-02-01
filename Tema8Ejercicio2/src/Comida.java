/**
 * 
 */

/**
 * @author Pablo_guerrero
 *
 */
public class Comida {

	protected String nombre;
	
	protected float peso;
	/**
	 * @param nombre
	 * @param peso
	 */
	public Comida(String nombre, float peso) {
		this.nombre = nombre;
		this.peso = peso;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comida [nombre=" + nombre + ", peso=" + peso + "]";
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
