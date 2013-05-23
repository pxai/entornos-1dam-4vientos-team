/**
 * 
 */
package org.cuatrovientos.LEGIONES;

import java.util.Random;

/**
 * Representa una unidad genérica de la legión
 * @author Caius Contomatus
 *
 */
public class unidaz {
	int ata;
	int def;
	Random alea= new Random();
	int vida_caballo;
	
	public unidaz () {
		ata = alea.nextInt(6) + 1;
		def = alea.nextInt(6) + 1;
	}
	
	public unidaz (int at, int df) {
		ata = at;
		def = df;
	}
	
	public void cabalgar () {
		System.out.println("Estoy cabalgando");
	}
	
	public int atacar () {
		int tot = 0;
		int ale = alea.nextInt(6);
		tot = ale + ata;
		return tot;
	}
	
	public int defen () {
		int tot = 0;
		int ale = alea.nextInt(6);
		tot = ale + def;
		return tot;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "unidaz [ata=" + ata + ", def=" + def + "]";
	}
}
