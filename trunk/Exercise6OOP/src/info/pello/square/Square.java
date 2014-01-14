/**
 * 
 */
package info.pello.square;

/**
 * Class to draw squares on console
 * @author pello_altadill
 *
 */
public class Square {
	
	private char character;
	
	/**
	 * default constructor
	 */
	public Square () {
		character = '#';
	}
	
	/**
	 * constructor with character argument
	 * @param character
	 */
	public Square (char character) {
		this.character = character;
	}
	
	/**
	 * set another character
	 * @param character
	 */
	public void setCharacter (char character) {
		this.character = character;
	}
	
	/**
	 * generates a String with the square painted
	 * @param size
	 * @return
	 */
	private String generate (int size) {
		String result = "";
		
		for (int i = 0; i<size; i++) {
			for (int j = 0; j<size; j++) {
				result = result + this.character;
			}			
			result = result + "\n";
		}
			
		return result;
	} 
	
	/**
	 * creates a square on console
	 * @param size
	 */
	public void create (int size) {
		String square = generate(size);
		System.out.println(square);
	}
	
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Square mySquare = new Square();
		Square otherSquare = new Square('x');
		mySquare.create(66);	
		
		mySquare.setCharacter('*');
		mySquare.create(6);
	}

}
