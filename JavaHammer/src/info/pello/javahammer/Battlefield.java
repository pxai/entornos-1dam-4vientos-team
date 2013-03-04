package info.pello.javahammer;

/**
 * Battlefield
 * Contains the battlefield of war
 * @author Pello Altadill
 *
 */
public class Battlefield {
	private String battleName;
	
	private Tile[][] map = new Tile[10][10];
	
	/**
	 * Battlefield
	 * Constructor
	 * @param battleName
	 */
	public Battlefield(String battleName)  {
		this.battleName = battleName;
		initialize();
	}
	
	/**
	 * initialize
	 * inits the battlefield
	 */
	private void initialize () {
		for (int i=0; i< 10; i++)
			for (int j=0; j< 10; j++)
				map[i][j] = new Tile("War tile");
	}
	
	
	public String show () {
		String mapString = "";

		for (int i=0; i< 10; i++) {
			for (int j=0; j< 10; j++) {
				mapString += map[i][j].show();
			}
			mapString += "\n";
		}
		return mapString;
	} 
}
