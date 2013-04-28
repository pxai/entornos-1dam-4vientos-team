
package info.pello.games.oca;

/**
 * La Oca - Game of Goose
 * This is an implementation of a really dumb game where
 * players just roll dices and move on, without any possible
 * choice. So It's a perfect game to for a computer to resolve,
 * because no human intervention is really needed.
 * First coded for educational purposes, then just for fun 
 * and finally... I don't know.
 * @author Pello Xabierl Altadill
 * @greets Movistar
 */
public class Main {

	/**
	 * I try to keep the main function simple, just an instance
	 * of Game class, initialization, a game loop and result.
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		
		game.addPlayer("Pello");
		game.addPlayer("June");
		game.addPlayer("Josu");
		game.addPlayer("COM");
		
		do {
			System.out.println(game.boardState());
			System.out.println(game.moveCurrent());
			game.nextTurn();
		} while (game.notFinished());

		System.out.println("\nLast state:");
		System.out.println(game.boardState());
		System.out.println(game.gameResult());

	}

}
