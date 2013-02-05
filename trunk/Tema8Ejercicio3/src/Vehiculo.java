import java.util.Random;

/**
 * 
 */

/**
 * @author raquel_valenzuela
 *
 */
public abstract class Vehiculo {
	protected String nombre;
	protected int velocidad;
	protected int aceleracion;
	protected int agarre;
	/**
	 * @param nombre
	 */
	public Vehiculo(String nombre) {
		this.nombre = nombre;
		inicializar();
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
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}
	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	/**
	 * @return the aceleracion
	 */
	public int getAceleracion() {
		return aceleracion;
	}
	/**
	 * @param aceleracion the aceleracion to set
	 */
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}
	/**
	 * @return the agarre
	 */
	public int getAgarre() {
		return agarre;
	}
	/**
	 * @param agarre the agarre to set
	 */
	public void setAgarre(int agarre) {
		this.agarre = agarre;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", velocidad=" + velocidad
				+ ", aceleracion=" + aceleracion + ", agarre=" + agarre + "]";
	}
	/**
	 * inicializar
	 * inicializa las variables de velocidad, aceleracion
	 * y agarre con valores aleatorios
	 */
	private void inicializar(){
		Random aleatorio= new Random();
		this.velocidad=aleatorio.nextInt(18);
		this.aceleracion=aleatorio.nextInt(18-this.velocidad);
		this.agarre=aleatorio.nextInt(18-this.velocidad-this.aceleracion);
	}
	/**
	 * mover
	 * devuelve el numero de posiciones que se mueve el coche
	 * @return
	 */
	public int mover()
	{
	 int resultado;
	 Random aleatorio= new Random();
	 
	 resultado=this.velocidad+this.aceleracion+aleatorio.nextInt(6);
	return resultado;
	}
	/*
	 * maniobrar
	 *maniobrar es la suma de agarre y un valor aleatorio
	 */
	public int maniobrar()
	{
	 int resultado;
	 Random aleatorio= new Random();
	 
	 resultado=this.agarre+aleatorio.nextInt(6);
	return resultado;
	}
}

