package org.cuatrovientos.craps;
import java.util.Scanner;


/**
 * java programa to play a pseudo-craps implementation
 * @author nigga madafaka
 *
 */
public class crapsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		double mny = 0;
		craps crps = new craps(66.6);
		
		do {
			System.out.println("How much you bet?");
			mny = reader.nextDouble();
			crps.putb(mny);
			crps.roll();
			System.out.println("You rolled: " + crps.d1 +","+crps.d2);
			if (crps.winOrwhat()) {
				System.out.println("You win, nigga");
				crps.win();
			} else {
				System.out.println("You lose, nigga");
				crps.lose();
			}
			System.out.println("Your money: " + crps.money);
		} while (mny != 0);
	}

}
