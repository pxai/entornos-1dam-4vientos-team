package org.cuatrovientos.mydick;
/**
 * 
 */

/**
 * @author Bad Taste
 * greetz in different languages
 */
public class mydick {

	/**
	 * Greets 
	 * @param lng chosen language
	 * @param rep how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greet_method (int lng, int rep) {
		String penis = "";
		String cock = "";
		
		switch (lng) {
			case 0 : cock = "hola";
					 break;
			case 1 : cock = "hello";
					 break;
			case 2 : cock = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet rep times
		for (int erection=0;erection<rep;erection++) {
			penis += cock;
		}
		
		return penis;
	}
}
