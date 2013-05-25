package org.cuatrovientos.EMPIRE_FLEET;

import java.util.Scanner;
import java.util.Vector;

/**
 * Represents an imperial fleet composed
 * of many space_ships
 * @author Sienar Fleet Systems
 * @greets the emperor
 */
public class fleet extends Vector<space_ship> {
	String commander_name;
	
	/**
	 * creates fleet
	 * three steps: define commander name, create fleet, show fleet
	 */
	public void create_fleet () {
		Scanner r = new Scanner(System.in);
		String o = "";
		String n = "";
		
		// Give commander name
		do {
			System.out.println("Identify yourself");
			commander_name = r.nextLine();
		} while (commander_name.isEmpty());
		
		// We start a loop to define the fleet
		// In each loop commander chooses one kind of ship to be added
		// to his fleet
		do {
			System.out.println("What kind of ship do you want?");
			System.out.println("1.TF \n 2.TA \n 3.TB \n 4.Exit\n");
			o = r.nextLine();
			
			switch (o) {
				case "1": // a tie fighter
						System.out.println("Name of the pilot: "); 
						n = r.nextLine();
						this.add(new tie_fighter(n));
						break;
				case "2":
						System.out.println("Name of the pilot: "); 
						n = r.nextLine();
						this.add(new tie_advanced(n));
						break;
				case "3":
						System.out.println("Name of the pilot: "); 
						n = r.nextLine();
						this.add(new tie_bomber(n));
						break;
				case "4":
						System.out.println("Ended.");
						break;
				default:
						System.out.println("Option incorrect");
			}
		} while(!o.equals("4"));
		
		// Resume: show complete fleet info
		// using foreach like for
		for (space_ship ship : this) {
			System.out.println("Type: " + ship.type + "," + ship.toString());
		}
	}
}
