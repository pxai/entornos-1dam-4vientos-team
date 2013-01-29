/**
 * 
 * @author victor_bregana
 *
 */
public class Ordenador extends Dispositivo{
	private String procesador;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param marca
	 * @param precio
	 */
	public Ordenador(String nombre, String marca, float precio) {
		super(nombre, marca, precio);
	}
	
	/**
	 * Constructor con + parámetro de este subclase
	 * @param nombre
	 * @param marca
	 * @param precio
	 * @param procesador
	 */
	public Ordenador(String nombre, String marca, float precio, String procesador) {
		super(nombre, marca, precio);
		this.procesador = procesador;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Ordenador [procesador=" + procesador + "]";
	}
}
