package org.cuatrovientos.LEGIONES;

/**
 * legio tiene un método para formar una centuria
 * @author Caius Contomatus
 *
 */
public class legio {
	/**
	 * método en el que se conforma
	 * una centuria de la legión formada por 80 unidades
	 */
	public void montar_centuria () {
		unidaz [] mi_super_centuria = new unidaz[80];
		
		// Vamos a meter 40 princeps
		for (int i = 0; i < 40; i++) {
			mi_super_centuria[i] = new  princeps();
		}

		// Vamos a meter 20 velites
		for (int i = 40; i < 60; i++) {
			mi_super_centuria[i] = new  velites();
		}
		
		// Vamos a meter 20 equites
		for (int i = 60; i < 80; i++) {
			mi_super_centuria[i] = new equite();
		}
		
		// Vamos a ver lo que tenemos:
		for (int i=0;i<80;i++) {
			if (i == 0) {
				System.out.println("Princeps------");
			}
			
			if (i == 40) {
				System.out.println("Velites-------");
			}
			
			if (i == 60) {
				System.out.println("Equites-------");
			}
			System.out.println(i+": " + mi_super_centuria[i].toString());
		}
		
	}
	
	public static void main (String args[]) {
		legio l = new legio();
		l.montar_centuria();
	}
}
