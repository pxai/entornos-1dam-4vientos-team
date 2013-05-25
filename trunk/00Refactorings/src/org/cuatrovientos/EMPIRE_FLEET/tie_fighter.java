package org.cuatrovientos.EMPIRE_FLEET;

/**
 * Represents a Tie Fighter starfighter
 * @author Sienar Fleet Systems
 * @greets the emperor
 */
public class tie_fighter extends space_ship {
	// attack range
	int range;
	// energy
	int energy;
	String pilot_name;
	// Coordinates
	int x;
	int y;
	int z;
	
	/**
	 * constructor
	 * @param n
	 */
	public tie_fighter (String n) {
		super(0);
		pilot_name = n;
	}
}
