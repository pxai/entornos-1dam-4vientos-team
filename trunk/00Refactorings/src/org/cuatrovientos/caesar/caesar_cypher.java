package org.cuatrovientos.caesar;


/**
 * implements caeser cipher system
 * @author Caius Contomatus, legio XIII
 *
 */
public class caesar_cypher {
	int shift;
	String alf = "abcdefghijklmnopqrstuvwxyz";
	String calf = "";
	
	public caesar_cypher (int sft) {
		this.shift = sft;
	}
	
	/**
	 * encrypts a String using caser cipher
	 * @param m
	 * @return
	 */
	public String encrpt (String m) {
		String encpm = "";

		m = m.toLowerCase();
		int pos = 0;
		
		for (int i=0;i<m.length();i++) {
			pos = alf.indexOf(m.charAt(i));
			pos = (pos + shift) % 26; 
			encpm += alf.charAt(pos);
		}
		
		return encpm;
	}
	
	/**
	 * decrypts a String using caser cipher
	 * @param m
	 * @return
	 */
	public String decrpt (String m) {
		String decpm = "";
		calf = "";
		m = m.toLowerCase();
		int pos = 0;
		
		for (int i=0;i<m.length();i++) {
			pos = alf.indexOf(m.charAt(i));
			pos = (26 + (pos - shift)) % 26; 
			decpm += alf.charAt(pos);
		}
		
		return decpm;
	}

}
