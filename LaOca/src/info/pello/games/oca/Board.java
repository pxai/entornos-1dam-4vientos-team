/**
 * 
 */
package info.pello.games.oca;

import java.util.Vector;

/**
 * The amazing Oca board, composed of positions
 * @author Pello Xabierl Altadill
 * @greets Simon Dice
 *
 */
public class Board {

	private Vector<Position> positions = new Vector<Position>();
	
	
	/**
	 * constructor calls init to initialize
	 */
	public Board () {
		init();
	}
	
	
	/**
	 * initializes board with hardcoded board data
	 * TODO get data from a file
	 */
	private void init() {
		int []jumps = new int[]{0,0,0,4,0,0,0,4,0,-2,0,4,-3,0,0,4,0,-10,0,0};
		String [] names = new String[]{"Normal","Normal","Normal","Oca","Normal","Normal","Normal","Oca",
										"Normal","Back2","Normal","Oca","Back3","Normal","Normal","Oca",
										"Normal","Back10","Normal","Finish line"};
		for (int i = 0; i< jumps.length;i++) {
			positions.add(new Position(i+1,names[i],jumps[i]));
		}
		
	}

	/**
	 * puts one player in first position
	 * @param player
	 */
	public void putPlayer(Player player) {
		positions.elementAt(0).playerIn(player);
	}

	/**
	 * giving a player returns his position
	 * @param player
	 * @return
	 */
	public int playerPosition(Player player) {
		for (Position position : positions) {
			if (position.hasPlayer(player)) {
				return position.getNumber();
			}
		}
		
		return -1;
	}
	
	/**
	 * tells if a player has reached finish line or not
	 * @param player
	 * @return player has reached finish
	 */
	public boolean playerReachedFinish(Player player) {	
			return positions.lastElement().hasPlayer(player);
	}
	
	/**
	 * moves and returns destination position
	 * @param i
	 * @return
	 */
	public Position move(Player player, int origin, int move) {
		int boundedDestiny = 0;

		// If we pass the limit, we get back
		if ((origin+move) > positions.size()) {
			boundedDestiny = positions.size() - (move - (positions.size() - origin));
		} else {
			boundedDestiny = origin+move;
		}
		
		// Player gets out from current position...
		positions.elementAt(origin-1).playerOut(player);
		
		// and players steps into new position.
		positions.elementAt(boundedDestiny-1).playerIn(player);

		return positions.elementAt(boundedDestiny-1);
	}
	
	/**
	 * Gives player list of a given board position
	 * @param position
	 * @return
	 */
	public Vector<Player> playersAt (int index) {
		return positions.elementAt(index).getPlayers();
	}
	
	/**
	 * gives player of finish position 
	 * @return
	 */
	public Vector<Player> playersAtFinish() {
		// TODO Auto-generated method stub
		return playersAt(positions.size()-1);
	}

	/**
	 * shows board state
	 * toString
	 */
	public String toString() {
		String boardData = "";
		
		for (Position position : positions) {
			boardData += position.toString() + "\n";
		}
			
		return boardData; 
	}



}
