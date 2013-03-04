package info.pello.javahammer;

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
	
	public Game (String battleName) {
		this.battleName = battleName;
		initialize();
	}
	
	private void initialize () {
		army1 = new Army("Demons",1);
		army2 = new Army("Undead",2);
		battlefield = new Battlefield(battleName);
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
}
