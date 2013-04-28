
package info.pello.games.oca;

import java.util.Random;
/**
 * A configurable dice
 * @author Pello Xabierl Altadill
 * @greets Simon Dice
 *
 */
public class Dice {

	private Random random = new Random();
	private int diceType;
	
	/**
	 * default constructor
	 * @param diceType
	 */
	public Dice(int diceType) {
		this.diceType = diceType;
	}

	/**
	 * rolls the dice
	 * @return
	 */
	public int roll() {
		// TODO Auto-generated method stub
		return random.nextInt(diceType) + 1;
	}

}
