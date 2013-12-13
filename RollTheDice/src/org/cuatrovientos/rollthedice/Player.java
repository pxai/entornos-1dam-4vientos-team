/**
 * 
 */
package org.cuatrovientos.rollthedice;

/**
 * @author pello_altadill
 *
 */
public class Player {
	private int strength;
	private int speed;
	private int inteligence;
	private int lifePoints;
	
	public Player() {
		
	}
	
	
	/**
	 * source > generate constructor using fields
	 * @param strength
	 * @param speed
	 * @param inteligence
	 * @param lifePoints
	 */
	public Player(int strength, int speed, int inteligence, int lifePoints) {
		this.strength = strength;
		this.speed = speed;
		this.inteligence = inteligence;
		this.lifePoints = lifePoints;
	}


	/**
	 * Player attacks
	 * @return damage points
	 */
	public int attack() {
		Dice dice = new Dice();
		return strength + dice.roll();
	}
	
	/**
	 * Player defends
	 * @return
	 */
	public int defend () {
		Dice dice = new Dice();
		return speed + dice.roll();
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the inteligence
	 */
	public int getInteligence() {
		return inteligence;
	}

	/**
	 * @param inteligence the inteligence to set
	 */
	public void setInteligence(int inteligence) {
		this.inteligence = inteligence;
	}

	/**
	 * @return the lifePoints
	 */
	public int getLifePoints() {
		return lifePoints;
	}

	/**
	 * @param lifePoints the lifePoints to set
	 */
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	
	
}
