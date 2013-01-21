/**
 * 
 * @author Carlos
 *
 */
public class Carta {
	
private String nombre;
private String palo;
private int valor;


/**
 * @param nombre
 * @param palo
 * @param valor
 */
public Carta(String nombre, String palo, int valor) {
	this.nombre = nombre;
	this.palo = palo;
	this.valor = valor;
}

/**
 * devuelve una cadena con la info de la carta
 * @return String
 */
@Override
public String toString() {
	return "Carta [nombre=" + nombre + ", palo=" + palo + ", valor=" + valor
			+ "]";
}

}
