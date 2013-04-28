package info.pello.games.oca;

import java.util.Vector;

/**
 * Defines one position of the board; the jump attribute makes
 * the player move forward or backward.
 * @author Pello Xabier Altadill
 *
 */
public class Position {
	
	private int number;
	private String name;
	private int jump;
	private Vector<Player> who = new Vector<Player>();
	
	/**
	 * @param number
	 * @param jump
	 */
	public Position(int number, String name, int jump) {
		this.number = number;
		this.name = name;
		this.jump = jump;
	}
	
	/**
	 * has a player in this position
	 * @param player
	 * @return
	 */
	public boolean hasPlayer (Player player) {
		return who.contains(player);
	} 
	
	/**
	 * player enters position
	 * @param player
	 */
	public void playerIn (Player player) {
		who.add(player);
	}
	
	/**
	 * player leaves from position
	 * @param player
	 */
	public void playerOut(Player player) {
		who.removeElement(player);
	}
	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the position name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the jump
	 */
	public int getJump() {
		return jump;
	}
	
	/**
	 * toString shows position and player (if any) data 
	 */
	public String toString() {
		String data = "";
		
		data += number + ": " + name + " j:"+ jump;
		if (who.size()>0) {
			data += " Player(s): ";
			for (Player player : who) {
				data += player.toString() +", ";
			}
		}
		
		return data;
	}

	/**
	 * gives players in this position
	 * @return
	 */
	public Vector<Player> getPlayers() {
		// TODO Auto-generated method stub
		return who;
	}

	
}
