import java.util.Vector;

/**
 * 
 */

/**
 * @author Benjamin Miller
 *
 */
public class Equipo {

	private String nombre;
	private int anofundacion;
	private double presupuesto;
	public Vector<Jugador> jugadores;
	
	/**
	 * @param nombre
	 * @param anofundacion
	 * @param presupuesto
	 */
	public Equipo(String nombre, int anofundacion, double presupuesto) {
		
		this.nombre = nombre;
		this.anofundacion = anofundacion;
		this.presupuesto = presupuesto;
		jugadores=new Vector<Jugador>();
	}
}
