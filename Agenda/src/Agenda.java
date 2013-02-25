/**
 * 
 */
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
/**
 * @author pello_altadill
 *
 */
public class Agenda 
extends Hashtable<Date, Cita>{
	
	/**
	 * introducitCita
	 * @param cita
	 */
	public void introducirCita(Cita cita) {
		this.put(cita.getFecha(), cita);
	}
	
	public void eliminarCita (Date fecha) {
		this.remove(fecha);
	}
	
	public String mostrarCita(Date fecha) {
		String resultado = "";
		
		if (this.get(fecha) == null) {
			resultado = "";
		} else {
			resultado = this.get(fecha).toString();
		}
		
		return resultado;
	}

	/**
	 * 
	 * @return
	 */
	public String mostrarCitas() {
		String resultado = "";
		Date fecha;
		Enumeration<Date> fechas = this.keys();
		
		while (fechas.hasMoreElements()) {
			fecha = fechas.nextElement();
			resultado = resultado + this.mostrarCita(fecha);
		}
		
		return resultado;
	}

}
