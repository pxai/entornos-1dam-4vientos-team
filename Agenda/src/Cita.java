import java.util.Date;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class Cita {
	Date fecha;
	String descripcion;
	/**
	 * @param fecha
	 * @param descripcion
	 */
	public Cita(Date fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cita [fecha=" + fecha + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
