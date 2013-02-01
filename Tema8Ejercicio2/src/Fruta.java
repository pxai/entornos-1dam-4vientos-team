
public class Fruta extends Comida{

	private String vitaminas;
	
	public Fruta(String nombre, float peso) {
		super(nombre, peso);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Fruta [vitaminas=" + getVitaminas() + ", nombre=" + nombre
				+ ", peso=" + peso + "]";
	}



	/**
	 * @return the vitaminas
	 */
	public String getVitaminas() {
		return vitaminas;
	}



	/**
	 * @param vitaminas the vitaminas to set
	 */
	public void setVitaminas(String vitaminas) {
		this.vitaminas = vitaminas;
	}

	
	
}
