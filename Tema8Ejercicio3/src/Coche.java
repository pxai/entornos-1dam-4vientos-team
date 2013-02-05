/**
 * 
 */

/**
 * @author ruben_delrio
 *
 */
public class Coche extends Vehiculo {
private String matricula;


	
	public Coche(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+ " Coche [matricula=" + matricula + "]";
	}
	
	



}
