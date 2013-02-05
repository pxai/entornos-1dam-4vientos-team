/**
 * 
 * @author eneko_lana  estuvo aquí
 *
 */
public class Circuito {
private String nombre;
private int posicion;
/**
 * @param nombre
 * @param posicion
 */
public Circuito(String nombre, int posicion) {
	this.nombre = nombre;
	this.posicion = posicion;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Circuito [nombre=" + nombre + ", posicion=" + posicion + "]";
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
 * @return the posicion
 */
public int getPosicion() {
	return posicion;
}
/**
 * @param posicion the posicion to set
 */
public void setPosicion(int posicion) {
	this.posicion = posicion;
}
}
