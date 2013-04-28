package info.pello.javahammer;

public class Bowmen 
extends Unit {

	
	public Bowmen(int armyNumber, String name, int number, String unitCode) {
		super(armyNumber, name, number, unitCode);
		this.range = 2;  
		this.move = 1;
		this.attack = 1;
		this.defense = 1;
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
