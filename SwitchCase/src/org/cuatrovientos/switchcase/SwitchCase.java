/**
 * 
 */
package org.cuatrovientos.switchcase;

import java.util.Scanner;

/**
 * Simple class to test switch case structure
 * @author pello_altadill
 *
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		String line = "";
		
		// Special object to read from console
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		line = reader.nextLine();
		
		number = Integer.parseInt(line);
		
		switch (number) {
			case 10:
						System.out.println("Messi");
						break;
			case 9:
			case 2:
						System.out.println("Toquero");
						break;
			case 7:
						System.out.println("Raúl");
						break;
			default:
						System.out.println("Ninguno");
						break;
		}

	}

}
