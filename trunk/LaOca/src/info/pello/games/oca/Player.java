
package info.pello.games.oca;

/**
 * The oca player, a total loser not worthy to be considered "player"
 * @author Pello Xabierl Altadill
 * @greets all gamers
 *
 */
public class Player {
	private String name;
	
	public Player(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* 
	 * perhaps one day this player will have more data
	 */
	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	

}
