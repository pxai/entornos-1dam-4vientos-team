package org.cuatrovientos.fartura;

/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class fartura {
	double tot;
	double subtot;
	
	public fartura (double stota) {
		subtot = stota;
	}
	
	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void ivaredu () {
		tot = subtot + (subtot * 0.21d);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void iva () {
		tot = subtot + (subtot * 0.04d);		
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void descuentoesp () {
		tot = subtot - (subtot * 0.10d);
	}

}
