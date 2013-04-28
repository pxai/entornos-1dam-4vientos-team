/**
 * 
 */
package info.pello.javahammer;

/**
 * makes war between two units
 * @author Pello Xabier
 *
 */
public class Combat {
	private Unit attacker;
	private Unit defender;

	
	/**
	 * Default constructor
	 * @param attacker unit
	 * @param defender unit
	 */
	public Combat (Unit attacker, Unit defender) {
		this.attacker = attacker;
		this.defender = defender;

	}
	
	/**
	 * combat
	 * @return attacker hit points
	 */
	public String resolveCombat () {
		String outcome = "Attack failed";
		int result = 0;
		result = attacker.attack() - defender.defend();
		
		// If attacker wins, decrease defender's life
		if (result > 0 ) {
			defender.decreaseLife();
			if (!defender.imAlive()) {
				outcome = "ENEMY KILLED";
			} else {
				outcome = "Attacker HIT!!";
			}
		}
		return outcome;
	}
	

}
