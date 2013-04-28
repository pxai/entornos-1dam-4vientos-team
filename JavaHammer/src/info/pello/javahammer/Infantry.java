package info.pello.javahammer;

public class Infantry 
extends Unit {
	private String unitCode = "I";
	
	public Infantry(int armyNumber, String name, int number, String unitCode) {
		super(armyNumber, name, number, unitCode);
		this.move = 1;
		this.attack = 2;
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
