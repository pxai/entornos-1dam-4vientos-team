package info.pello.javahammer;

/**
 * Commander
 * A special unit for future use, now It contains
 * the player's name.
 * @author root
 *
 */
public class Commander 
extends Unit {

	/**
	 * lord Commander of the Army
	 * @param armyNumber
	 * @param name
	 * @param number
	 */
	public Commander(int armyNumber, String name, int number) {
		super(armyNumber, name, number);
		this.move = 2;
		this.attack = 4;
		this.defense = 3;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * attack
	 * @return total attack points
	 */
	public  int attack() {
		return attack + random.nextInt(3 + life);
	}

	/**
	 * defend
	 * @return total defense points
	 */
	public  int defend() {
		return attack + random.nextInt(3 + life);
	}
}
