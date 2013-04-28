package info.pello.javahammer;

public class Chivalry 
extends Unit {
	
	public Chivalry(int armyNumber, String name, int number, String unitCode) {
		super(armyNumber, name, number, unitCode);
		this.move = 2;
		this.attack = 3;
		this.defense = 2;
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
