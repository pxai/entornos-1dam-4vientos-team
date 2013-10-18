/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * Prints * many times
 * @author pello_altadill
 *
 */
public class LoopExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter a number, please:");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		if (number > 0 && number % 2 == 0) {			
			for (int i=0; i<number; i++) {
				System.out.print("*");
			}
		} else {
			System.out.println("Number must be even and positive");
			System.exit(0); /* end with exit code 0*/
		}
		
		reader.close();
		
	}

}
