/**
 * 
 */

/**
 * @author Castillo
 *
 */
public class Movil extends Dispositivo{
	private String numero;	

	/**
	 * Constructor
	 * @param nombre
	 * @param marca
	 * @param precio
	 */
	public Movil(String nombre, String marca, float precio) {
		super(nombre, marca, precio);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * @param nombre
	 * @param marca
	 * @param precio
	 * @param numero
	 */
	public Movil(String nombre, String marca, float precio, String numero) {
		super(nombre, marca, precio);
		// TODO Auto-generated constructor stub
		this.numero = numero;
	}

	/**
	 * llamar, hace como que llama
	 * @param numero
	 */
public void llamar(int numero){
	System.out.println("Llamando a"+ numero);
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	//super.toString();
	return super.toString() +"Movil [numero=" + numero + "]";
}



}
