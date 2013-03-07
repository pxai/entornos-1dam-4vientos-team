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
	private int armyNumber;
	private String name;
	private int number;
	private int attack;
	private int defense;
	private int move;
	private int range;
	private int life = 3;
	private String unitCode;
	private Random random = new Random();
	
	public Unit (int armyNumber, String name, int number) {
		this.armyNumber = armyNumber;
		this.name = name;
		this.number = number;
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
		statusResult += "Mov: " + move +" Rng:" + range;
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
	public int attack() {
		return attack + random.nextInt(3 + life);
	}

	/**
	 * defend
	 * @return total defense points
	 */
	public int defend() {
		return attack + random.nextInt(3 + life);
	}

}
