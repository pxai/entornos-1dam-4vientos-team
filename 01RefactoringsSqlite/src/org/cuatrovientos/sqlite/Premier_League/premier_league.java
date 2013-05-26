package org.cuatrovientos.sqlite.Premier_League;

import java.sql.*;

/**
 * Shows premier league table, which is stored in a SQLite DB.
 * @author The Special One
 *
 */
public class premier_league {
	Connection con;

	/**
	 * default constructor
	 */
	public premier_league () {
	  
	}
  
	/**
	 * shows table data from database
	 * @return String with data
	 */
	public String show_league_table () {
		String r = "";
		 try {
			    Class.forName("org.sqlite.JDBC");
			    con =
			      DriverManager.getConnection("jdbc:sqlite:premierleague.db");
			    Statement stat = con.createStatement();
			
			    
			    // Now we select data and we show results in a loop.
			    ResultSet rs = stat.executeQuery("select * from premiertable;");
			    while (rs.next()) {
			      r += rs.getInt("id");
			      r += ".- " + rs.getString("name");
			      r += "\tpoints: " + rs.getInt("points") + "\n";
			    }
			    
			    // We close both the ResultSet and the DB connection
			    rs.close();
			    con.close();
			    
		// In case of exception we catch them
		  } catch (SQLException sqle) {
			  System.err.println("SQL Exception: " + sqle.getMessage());
		  } catch (Exception e) {
			  System.err.println("Exception: " + e.getMessage());
		  }
		 
		 return r;
	}
  
  public static void main(String[] args) {
	  premier_league pl = new premier_league();
	  System.out.println(pl.show_league_table());
	 
  }
}