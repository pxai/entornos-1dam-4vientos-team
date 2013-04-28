/**
 * 
 */
package info.pello.games.oca;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author luser
 *
 */
public class DiceTest {
	private static final int DICETYPE = 6;
	@Test
	public void testRoll() {
		Dice dice = new Dice(DICETYPE);
		for (int i=0;i<100;i++) {
			assertTrue("Dice gives proper values", dice.roll()>0 && dice.roll()<=DICETYPE);
		}
	}

}
