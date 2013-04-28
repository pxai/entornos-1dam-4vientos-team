/**
 * 
 */
package info.pello.games.oca;

import java.util.Vector;

/**
 * This contains all the game logic. Basically decides turns and
 * moves players along the board.
 * @author Pello Xabierl Altadill
 * @greets Movistar
 *
 */
public class Game {

	private Vector<Player> players = new Vector<Player>();
	private int currentPlayer = 0;
	private Board board = new Board();
	private boolean notFinished = true;
	Dice dice = new Dice(3);

	/**
	 * adds player to the game
	 * @param name
	 */
	public void addPlayer(String name) {
		Player player = new Player(name);
		players.add(player);		
		board.putPlayer(player);
	}

	/**
	 * begins the game
	 */
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * nextTurn
	 * detects if player has reached finish line too.
	 * @return next player's name
	 */
	public String nextTurn () {
		int finishedPlayers = 0;
		int totalPlayers = players.size();
		
		do {
			if (currentPlayer == (players.size()-1)) {
				currentPlayer = 0;
			} else {
				currentPlayer++;
			}
			// We must skip player when he has reached finish
			if (board.playerReachedFinish(players.elementAt(currentPlayer))) {
				finishedPlayers++;
			} else {
				// If not, just return It
				return players.elementAt(currentPlayer).getName();				
			}
		} while (finishedPlayers < totalPlayers);
		
		// The game is finished
		notFinished = false;
		
		return "FINISHED";
	}
	
	/**
	 * moves current player where dice says
	 * In case of jumping position player moves once again but no more.
	 */
	public String moveCurrent() {
		String moveData = "";
		int move = dice.roll();
		Player player = players.elementAt(currentPlayer);
		int currentPosition = board.playerPosition(player); 
		
		moveData = player.getName()+";Pos: " + currentPosition + ";Rolled: " + move;

		Position newPosition = board.move(player, currentPosition, move);
		
		moveData += ";New position: " + newPosition.toString();
		
		// new position has Jump? we must move then
		if (newPosition.getJump() != 0) {
			moveData += "; Jump!! " + newPosition.getJump();
			Position jumpPosition =  board.move(player, newPosition.getNumber(), newPosition.getJump());
			moveData += "; New position after jump: " + jumpPosition.toString();
		}
		
		return moveData;
	}

	/**
	 * tells if game is not finished
	 * @return
	 */
	public boolean notFinished() {
		return notFinished;
	}
	
	/**
	 * shows board state, with positions and player info
	 * @return all board state
	 */
	public String boardState() {
		return board.toString();
	}
	
	/**
	 * gives player names for finish line.
	 * @return
	 */
	public String gameResult () {
		String playerNames = "";
		Vector<Player> players = board.playersAtFinish();
		
		for (int i = 0; i< players.size(); i++) {
			playerNames += i + ". " + players.elementAt(i).getName() + "\n";
		}
		
		return playerNames;
	}

}
