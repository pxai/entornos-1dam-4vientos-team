package info.pello.javahammer;

import java.util.Vector;

/**
 * Game
 * All the game world & logic goes here
 * @author Pello Altadill
 *
 */
public class Game {
	private Army army1;
	private Army army2;
	private Battlefield battlefield;
	private String battleName;
	private Army currentArmy;
	private Army nextArmy;
	
	public Game (String battleName) {
		this.battleName = battleName;
		initialize();
	}
	
	private void initialize () {
		army1 = new Army("Demons",1);
		army2 = new Army("Undead",2);
		battlefield = new Battlefield(battleName);
		currentArmy = army1;
		nextArmy = army2;
	}

	/**
	 * @return the army1
	 */
	public Army getArmy1() {
		return army1;
	}

	/**
	 * @return the army2
	 */
	public Army getArmy2() {
		return army2;
	}

	/**
	 * @return the battlefield
	 */
	public Battlefield getBattlefield() {
		return battlefield;
	}

	/**
	 * @return the battleName
	 */
	public String getBattleName() {
		return battleName;
	}
	
	/**
	 * getCurrentArmy
	 * @return the name of the army
	 */
	public Army getCurrentArmy () {
		return currentArmy;
	}
	
	/**
	 * getNextArmy
	 * @return the name of the army
	 */
	public Army getNextArmy () {
		return nextArmy;
	}
	
	/**
	 * turn
	 * new turn.
	 */
	public void turn () {
		Army tmpArmy;
		tmpArmy = currentArmy;
		currentArmy = nextArmy;
		nextArmy = tmpArmy;
	}
	
	/**
	 * notGameOver
	 * @return true if game is not over
	 */
	public boolean notGameOver () {
		return army1.isAlive() && army2.isAlive();
	}
	
	/**
	 * getArmyStatus
	 * returns army status
	 */
	public Vector<String> getArmyStatus () {
		return currentArmy.getStatus();
	}
}
