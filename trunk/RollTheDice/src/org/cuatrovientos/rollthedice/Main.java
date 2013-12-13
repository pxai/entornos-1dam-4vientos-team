/**
 * 
 */
package org.cuatrovientos.rollthedice;

/**
 * Main class to test the Dice	
 * @author pello_altadill
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dice myDice = new Dice();
		Dice d10 = new Dice(10);
		
		for (int i=0;i<100;i++) {
			System.out.println(myDice.roll());
			System.out.println(d10.roll());
		}
		
		Player onePlayer = new Player();
		onePlayer.setStrength(6);
		onePlayer.setSpeed(5);
		onePlayer.setInteligence(1);
		onePlayer.setLifePoints(100);
		
		Player anotherPlayer = new Player(6,5,7,100);

	}

}




