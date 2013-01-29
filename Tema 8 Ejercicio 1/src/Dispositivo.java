/**
 * 
 * @author victor_Bregana
 *
 */
public class Dispositivo {
	protected String nombre;
	protected String marca;
	protected float precio;
	
	/**
	 * @param nombre
	 * @param marca
	 * @param precio
	 */
	public Dispositivo(String nombre, String marca, float precio) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dispositivo [nombre=" + nombre + ", marca=" + marca
				+ ", precio=" + precio + "]";
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
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
