/**
 * 
 */
package org.cuatrovientos.LEGIONES;

import java.util.Random;

/**
 * @author luser
 *
 */
public class unidaz {
	int ata;
	int def;
	Random alea= new Random();
	int vida_caballo;
	
	public unidaz () {
		
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
}
