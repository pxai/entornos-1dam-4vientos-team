package org.cuatrovientos.EMPIRE_FLEET;

/**
 * 	Represents a generic space_ship
 * @author Sienar Fleet Systems
 * @greets the emperor
 */
public class space_ship {
	int bombs;
	int type;
	int speed;
	
	/**
	 * constructor
	 * @param t
	 */
	public space_ship (int t)  {
		type = t;
	}
	
	/**
	 * only for bomber type (==2)
	 * drop a bomb
	 * @return bomb damage
	 */
	public int bomb () {
		if (type == 2)
			return 5;
		else
			return 0;
	}
	
	/**
	 * only tie advanced and bombers
	 * fires ION cannon
	 * @return damage
	 */
	public int fire_ion_cannon () {
		if (type==1 || type==2) 
			return 3;
		else 
			return 0;
	}
	
	/**
	 * "I'm firing my laser"
	 * @return laser damage depending of type
	 */
	public int fire_laser () {
		int damage = 0;
		switch (type) {
			case 0: damage = 1;
					break;
			case 1: damage = 2;
					break;
			case 2: damage = 3;
					break;
			default:damage = 0;
					break;
		}
		
		return damage;
	}
	
	/**
	 * move, more or less depending on type
	 * @return positions
	 */
	public int move () {
		int movement = 0;
		switch (type) {
			case 0: movement = 1;
					break;
			case 1: movement = 3;
					break;
			case 2: movement = 2;
					break;
			default:movement = 0;
					break;
		}
		
		return movement;
	}
}
