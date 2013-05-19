package org.cuatrovientos.pene;
import java.util.Random;


/**
 * @author Programador de mal gusto
 * @greets a D. Cobol por la inspiración
 */
public class gen_pene {
	/**
	 * genera contraseñas largas y duras como un pene
	 * @param pene
	 * @return
	 */
	public String comeme_el_nardo_a_dos_manos (int pene) {
		String pene_erecto = "";
		String cimbel_matutino = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random aleatroncho = new Random();
		int longitud_badajo = cimbel_matutino.length();
		
		if (pene < 8 || pene > 20) {
			return "Longitud incorrecta";
		}
		
		for (int pollon_como_un_camion=0;pollon_como_un_camion<pene;pollon_como_un_camion++) {
			pene_erecto += cimbel_matutino.charAt(aleatroncho.nextInt(longitud_badajo));
		}
		
		return pene_erecto;
	}
}
