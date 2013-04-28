package info.pello.javahammer;

import java.util.Random;

/**
 * Unit
 * Represents one unit of the army
 * must be extended by specific units
 * @author Pello Altadill
 *
 */
public abstract class Unit {
	protected int armyNumber;
	protected String name;
	protected int number;
	protected int attack;
	protected int defense;
	protected int move = 1;
	protected int range = 1;
	protected int life = 3;
	protected String unitCode;
	protected Random random = new Random();

	public static final int INFANTRY = 0;
	public static final int BOWMEN = 1;
	public static final int CHIVALRY = 2;
	
	public Unit (int armyNumber, String name, int number) {
		this.armyNumber = armyNumber;
		this.name = name;
		this.number = number;
	}

	public Unit (int armyNumber, String name, int number, String unitCode) {
		this.armyNumber = armyNumber;
		this.name = name;
		this.number = number;
		this.unitCode = unitCode;
	}
	
	/**
	 * factory method to create units
	 * @param armyNumber
	 * @param name
	 * @param number
	 * @param unitCode
	 * @param type
	 * @return
	 */
	public static Unit create (int armyNumber, String name, int number, String unitCode, int type) {

		switch (type) {
			case INFANTRY : return new Infantry(armyNumber, name, number, unitCode);

			case BOWMEN : return new Bowmen(armyNumber, name, number, unitCode);

			case CHIVALRY : return new Chivalry(armyNumber, name, number, unitCode);

			default:
						throw new RuntimeException("Unkown army type you madafaka you");
		}
	}

	/**
	 * show
	 * shows unit info for the map
	 * @return
	 */
	public String show() {
		return armyNumber+""+unitCode+""+number;
	}

	/**
	 * @return the armyNumber
	 */
	public int getArmyNumber() {
		return armyNumber;
	}

	/**
	 * @param armyNumber the armyNumber to set
	 */
	public void setArmyNumber(int armyNumber) {
		this.armyNumber = armyNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * @return the move
	 */
	public int getMove() {
		return move;
	}

	/**
	 * @param move the move to set
	 */
	public void setMove(int move) {
		this.move = move;
	}

	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}

	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}

	public String status () {
		String statusResult = "";
		
		if (life < 1) { statusResult += "[DEAD] "; }
		statusResult += name + " no:" + number + ". ";
		statusResult += "Att: " + attack +" Def:" + defense;
		statusResult += " Mov: " + move +" Rng:" + range;
		statusResult += " Life: " + life;
		return statusResult;
	}
	
	
	/**
	 * decreaseLife
	 * decrements a life point
	 */
	public void decreaseLife () {
		if (life >0)
			life--;
	}
	
	/**
	 * imAlive
	 * 
	 * @return true if unit is still alive
	 */
	public boolean imAlive () {
		return (life > 0);
	}
	
	/**
	 * attack
	 * @return total attack points
	 */
	public abstract int attack();

	/**
	 * defend
	 * @return total defense points
	 */
	public abstract int defend();

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * @return the unitCode
	 */
	public String getUnitCode() {
		return unitCode;
	}

	/**
	 * @param unitCode the unitCode to set
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}


}
