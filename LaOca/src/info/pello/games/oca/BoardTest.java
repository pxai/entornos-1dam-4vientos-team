/**
 * 
 */
package info.pello.games.oca;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author luser
 *
 */
public class BoardTest {
	
	private Board board;
	private Player player1;
	private Player player2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		board = new Board();
		player1 = new Player("Player1");
		player2 = new Player("Player2");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testMove() {
		//board.addPlayer(player1);
		//assertEquals("tests correct move", board.move(1).getPostion().getNumber(),2);
	}

}
