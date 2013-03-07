package info.pello.javahammer;

public class Infantry 
extends Unit {
	private String unitCode = "I";
	
	public Infantry(int armyNumber, String name, int number) {
		super(armyNumber, name, number,"I");
		// TODO Auto-generated constructor stub
	}

	/**
	 * show
	 * shows unit info for the map
	 * @return
	 */
	@Override
	public String show() {
		return armyNumber+""+unitCode+""+number;
	}
}
