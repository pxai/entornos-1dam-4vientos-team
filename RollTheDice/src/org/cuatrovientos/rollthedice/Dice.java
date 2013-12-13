/**
 * 
 */
package org.cuatrovientos.rollthedice;

import java.util.Random;

/**
 * Represents a dice
 * @author pello_altadill
 */
public class Dice {
	// attributes
	private int sides;
	
	// constructor
	public Dice () {
		sides = 6;
	}
	
	/**
	 * constructor with sides
	 * @param sides
	 */
	public Dice (int sides) {
		this.sides = sides;
	}

	/**
	 * rolls the dice
	 * @return value
	 */
	public int roll () {
		Random random = new Random();
		return random.nextInt(sides) + 1;
	}

	/**
	 * @return the sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	
	
	
	
	
	
	
}
