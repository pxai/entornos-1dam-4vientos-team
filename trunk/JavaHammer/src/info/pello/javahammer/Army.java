package info.pello.javahammer;

import java.util.Vector;

/**
 * Army
 * Pepresents one Army of JavaHammer
 * @author Pello Altadill
 *
 */
public class Army extends Vector<Unit>{
	private String name;
	private int armyNumber;
	private Commander commander;
	
	public Army (String name, int armyNumber) {
		this.name = name;
		this.armyNumber = armyNumber;
		initialize();
	}
	
	/*
	 * initialize
	 * inits two armies
	 */
	private void initialize () {
		// three units of bowmen and infantry
		for (int i=1;i<4;i++) {
			this.add(Unit.create(armyNumber,"Bowmen",i,"B",Unit.BOWMEN));
			this.add(Unit.create(armyNumber,"Infantry",i,"I", Unit.INFANTRY));
		}
		
		// two units of chivalry
		this.add(Unit.create(armyNumber,"Chivalry",1,"C", Unit.CHIVALRY));
		this.add(Unit.create(armyNumber,"Chivalry",2,"C", Unit.CHIVALRY));
		
	}
	
	/**
	 * show
	 * Show status of every unit
	 * @return
	 */
	public String show () {
		String armyInfo = "";
		
		for (Unit unit : this) {
			armyInfo += unit.status() + "\n";
		}
		
		return armyInfo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the number
	 */
	public int getArmyNumber() {
		return armyNumber;
	}

	/**
	 * @return the commander
	 */
	public Commander getCommander() {
		return commander;
	}

	/**
	 * isAlive
	 * army is alive if any unit is still alive
	 * @return whether army is alive or not.
	 */
	public boolean isAlive() {
		
		for (int i=0;i<this.size();i++) 
			if (this.get(i).imAlive()) 
				return true;
		
		return false;
	}
	
	/**
	 * getStatus
	 * shows the list of all units
	 * @return
	 */
	public Vector<String> getStatus () {
		Vector<String> status = new Vector<String>();
		
		for (int i=0;i<this.size();i++) {
			status.add(this.get(i).status());
		}
		
		return status;
	}
	

}
