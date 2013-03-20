package info.pello.javahammer;

/**
 * Battlefield
 * Contains the battlefield of war
 * @author Pello Altadill
 * @greets: Carlos Rota, for the rangeCheck algorythm
 * TODO: variable MAP_SIZE
 */
public class Battlefield {
	private String battleName;
	public final static int MAP_SIZE = 10;
	
	private Tile[][] map = new Tile[MAP_SIZE][MAP_SIZE];
	
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
		for (int i=0; i< MAP_SIZE; i++)
			for (int j=0; j< MAP_SIZE; j++)
				map[i][j] = new Tile("War tile");
	}
	
	
	/**
	 * show
	 * Shows the map
	 * @return a String containing a map view
	 */
	public String show () {
		String mapString = " ";
		for (int i=0; i< MAP_SIZE; i++) {
			mapString += " " + i + " ";
		}
		
		mapString += "\n";
		
		for (int i=0; i< MAP_SIZE; i++) {
				mapString += i;
			for (int j=0; j< MAP_SIZE; j++) {
				mapString += map[i][j].show();
			}
			mapString += "\n";
		}
		return mapString;
	} 
	
	/**
	 * isAnybodyThere
	 * @param x
	 * @param y
	 * @param army
	 * @return
	 */
	public boolean isAnybodyThere (int x, int y, int army) {
		
		return  (withinBounds(x,y) 
					&& !map[x][y].isEmpty()
						&& map[x][y].getUnit().getArmyNumber() == army);
	}
	
	/**
	 * withinBounds
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean withinBounds (int x, int y) {
		return (x >= 0 && x < MAP_SIZE && y >= 0 && y < MAP_SIZE);
		
	}
	
	/**
	 * isMoveCorrect
	 * tell us if movement is possible for this unit.
	 * @param originX
	 * @param originY
	 * @param destinyX
	 * @param destinyY
	 * @param armyNumber
	 * @return
	 */
	public boolean isMoveCorrect(int originX, int originY,
			int destinyX, int destinyY) {
		// TODO Auto-generated method stub
		int moveRange = map[originX][originY].getUnit().getMove();

		return isRangeCorrect(originX, originY, destinyX, destinyY, moveRange);

	}

	
	/**
	 * isAttackRangeCorrect
	 * @param attackerX
	 * @param attackerY
	 * @param defenderX
	 * @param defenderY
	 * @return
	 */
	public boolean isAttackRangeCorrect(int attackerX, int attackerY,
			int defenderX, int defenderY) {
		// TODO Auto-generated method stub
		int attackRange = map[attackerX][attackerY].getUnit().getRange();

		return  isRangeCorrect(attackerX,attackerY, defenderX, defenderY, attackRange);
	}

	/**
	 * isRangeCorrect
	 * given to coords and a distance tells if reachable or not.
	 * @param originX
	 * @param originY
	 * @param destinyX
	 * @param destinyY
	 * @param moveRange
	 * @return
	 */
	private boolean isRangeCorrect(int originX, int originY, int destinyX,
			int destinyY, int moveRange) {
		return (Math.abs(destinyX-originX) <= moveRange && Math.abs(destinyY-originY) <= moveRange);
	}

	/**
	 * isEmpty
	 * tell us if a tile of the battlefield is empty
	 * @param destinyX
	 * @param destinyY
	 * @return
	 */
	public boolean isEmpty(int destinyX, int destinyY) {
		// TODO Auto-generated method stub
		return map[destinyX][destinyY].isEmpty();
	}
	
	/**
	 * moveUnit
	 * moves one unit from one place to another
	 * @param originX
	 * @param originY
	 * @param destinyX
	 * @param destinyY
	 */
	public void moveUnit(int originX, int originY, int destinyX, int destinyY) {
		map[destinyX][destinyY].setUnit(map[originX][originY].getUnit());
		map[originX][originY].remove();
	}

	/**
	 * gets unit from given coords
	 * @param i
	 * @param j
	 * @return
	 */
	public Unit getUnit(int i, int j) {
		// TODO Auto-generated method stub
		return map[i][j].getUnit();
	}

	/**
	 * move unit to given coords
	 * @param unit
	 * @param i
	 * @param j
	 */
	public void putUnit(Unit unit, int i, int j) {
		// TODO Auto-generated method stub
		map[i][j].setUnit(unit);
	}
	
	/**
	 * 
	 * @param attacker
	 * @param defender
	 * @return damage done or not
	 */
	public boolean attack (Unit attacker, Unit defender) {
		if (defender.defend() - attacker.attack() <= 0 ) {
			defender.decreaseLife();
			return true;
		} else {
			return false;
		}
	}

}
