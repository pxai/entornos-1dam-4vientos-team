package info.pello.javahammer;
/**
 * 
 */

/**
 * @author luser
 *
 */
public class GameMenuOption {
	private int number;
	private String name;
	private boolean justOnce;
	/**
	 * @param number
	 * @param name
	 * @param justOnce
	 */
	public GameMenuOption(int number, String name, boolean justOnce) {
		this.number = number;
		this.name = name;
		this.justOnce = justOnce;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the justOnce
	 */
	public boolean isJustOnce() {
		return justOnce;
	}
	
	
	
}
