
public class Caramelo extends Comida {
	
public Caramelo(String nombre, float peso) {
		super(nombre, peso);
		// TODO Auto-generated constructor stub
	}
/**
 * @param nombre
 * @param peso
 * @param calorias
 */
public Caramelo(String nombre, float peso, int calorias) {
	super(nombre, peso);
	this.calorias = calorias;
}

private int calorias;

/**
 * @return the calorias
 */
public int getCalorias() {
	return calorias;
}

/**
 * @param calorias the calorias to set
 */
public void setCalorias(int calorias) {
	this.calorias = calorias;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Caramelo [calorias=" + calorias + "]";
}
}
