package info.pello.javahammer;

/**
 * Tile
 * A single tile or place of the map,
 * where only one unit can stay
 * @author Pello Altadill
 *
 */
public class Tile {
	private String name;
	private Unit unit = null;

	/**
	 * Tile
	 * constructor
	 * @param name of the place
	 */
	public Tile (String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the unit
	 */
	public Unit getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	/**
	 * remove a unit from this Tile
	 */
	public void remove () {
		this.unit = null;
	}

	/**
	 * show
	 * shows tile info for the map
	 * @return
	 */
	public String show() {
		if (this.unit == null)
			return "[ ]";
		else
			return this.unit.show();
	}
	
}
