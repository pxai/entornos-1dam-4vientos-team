package info.pello.javahammer;

import java.util.Vector;

/**
 * Game
 * All the game world & logic goes here
 * @author Pello Altadill
 * TODO: internationalization i18n
 */
public class Game {
	private Army army1;
	private Army army2;
	private Battlefield battlefield;
	private String battleName;
	private Army currentArmy;
	private Army nextArmy;
	private Vector<GameMenuOption> options;
	
	public Game (String battleName) {
		this.battleName = battleName;
		initialize();
	}
	
	/**
	 * initialize
	 * TODO: get army names from user interface, etc...
	 */
	private void initialize () {
		army1 = new Army("Demons",1);
		army2 = new Army("Undead",2);
		battlefield = new Battlefield(battleName);
		
		for (int i = 1; i<= army1.size();i++) {
			battlefield.putUnit(army1.get(i-1),9,i);
			battlefield.putUnit(army2.get(i-1),0,i);
		}
		
		currentArmy = army1;
		nextArmy = army2;
		
		options = new Vector<GameMenuOption>();
		
		initMenu();
		
	}

	/**
	 * inits turn menu
	 */
	private void initMenu() {
		options.removeAllElements();
		options.add(new GameMenuOption("m","Move",true));
		options.add(new GameMenuOption("a","Attack",true));
		options.add(new GameMenuOption("s","Show Map",false));
		options.add(new GameMenuOption("t","Show Army Status",false));
		options.add(new GameMenuOption("p","Pass",false));
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
	 * new turn, swap currentArmy with nextArmy
	 * TODO: this works fine but just for two players
	 */
	public void turn () {
		Army tmpArmy;
		tmpArmy = currentArmy;
		currentArmy = nextArmy;
		nextArmy = tmpArmy;
		initMenu();
	}
	
	/**
	 * notGameOver
	 * @return true if game is not over
	 */
	public boolean notGameOver () {
		return army1.isAlive() && army2.isAlive();
	}
	
	/**
	 * showBattlefield
	 * returns battlefield map
	 */
	public String showBattlefield () {
		return battlefield.show();
	}
	
	/**
	 * getArmyStatus
	 * returns army status
	 */
	public Vector<String> getArmyStatus () {
		return currentArmy.getStatus();
	}
	
	/**
	 * giveOptions
	 * @return Vector with a menú of options for user
	 */
	public Vector<GameMenuOption> giveOptions () {
		return options;
	}
	
	/**
	 * removes Option from menu
	 * @param
	 */
	public void removeOption (String code) {
        for (int i = 0;i< options.size();i++) {
            if (options.get(i).getCode().equals(code) ) {
            	options.remove(i);
            } 
        }
	}
	
	/**
	 * attack
	 * 
	 * @param attackerX
	 * @param attackerY
	 * @param defenderX
	 * @param defenderY
	 * @return a message with result
	 * TODO: change x,y with a Coord class
	 */
	public String attack (int attackerX, int attackerY, int defenderX, int defenderY) {
		String result = "OK";
		
		if (!battlefield.isAnybodyThere(attackerX, attackerY, currentArmy.getArmyNumber())) {
			return "ERROR:You don't have any unit there.";
		}

		if (!battlefield.isAnybodyThere(defenderX, defenderY, nextArmy.getArmyNumber())) {
			return "ERROR:There is no enemy unit there.";
		}
		
		if (!battlefield.isAttackRangeCorrect(attackerX,attackerY,defenderX,defenderY)) {
			return "ERROR:Your attack range does not reach the enemy";
		}

		Combat combat = new Combat(this.battlefield.getUnit(attackerX,attackerY),this.battlefield.getUnit(defenderX,defenderY));
		result += ":" + combat.resolveCombat();
		
		
		return result;
	}
	
	
	/**
	 * move
	 * @param originX
	 * @param originY
	 * @param destinyX
	 * @param destinyY
	 * @return a message with result
	 * TODO: change x,y with a Coord class
	 */
	public String move (int originX, int originY, int destinyX, int destinyY) {
		String result = "OK";
		
		if (!battlefield.isAnybodyThere(originX, originY, currentArmy.getArmyNumber())) {
			return "ERROR:You don't have any unit there.";
		}

		if (!battlefield.isEmpty(destinyX,destinyY)) {
			return "ERROR:There is another unit there.";
		}
		
		if (!battlefield.isMoveCorrect(originX, originY, destinyX, destinyY)) {
			return "ERROR:Your move range does not reach destiny";
		}
		
		// Everything is ok, we can move unit
		battlefield.moveUnit(originX, originY, destinyX, destinyY);
		

		return result;
	}
	
}
