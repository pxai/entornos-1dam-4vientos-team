package org.cuatrovientos.sqlite.ChickTionary;

import java.sql.*;
import java.util.Scanner;


/**
 * Behold the power of the chicktionary, a list of
 * hot babes in your hands http://www.youtube.com/watch?v=2yepI7I0TlA
 * @author Will Smith, Carlton Banks
 *
 */
public class chick_tionary {
	Connection con;

	/**
	 * default constructor
	 */
	public chick_tionary () {
	  
	}
  
	/**
	 * shows table data from database
	 * @return String with data
	 */
	public void manage_table () {
		String r = "";
		Scanner rd = new Scanner(System.in);
		String nam = "";
		String phon = "";
		 try {
			 	// Connect to chicktionary
			    Class.forName("org.sqlite.JDBC");
			    con = DriverManager.getConnection("jdbc:sqlite:chicktionary.db");

			    
                // We will insert a new chick using a prepared statement
                PreparedStatement prep = con.prepareStatement(
                          "insert into chick (name,phone) values (?,?);");
                
               // We ask for data to user:
                System.out.println("Please enter chick's name: ");
                nam = rd.nextLine();
                System.out.println("And phone number: ");
                phon = rd.nextLine();
                
                // For each new register we set the parameter and we add batch
                prep.setString(1, nam);
                prep.setString(2, phon);
                prep.addBatch();

                // ... executing the batch we finally insert data
                prep.executeBatch();

			    // We create a new Statement
			    Statement stat = con.createStatement();
			
			    // Now we select data and we show results in a loop.
			    ResultSet rs = stat.executeQuery("select * from chick;");
			    while (rs.next()) {
			      System.out.print(rs.getInt("id"));
			      System.out.print(".- " + rs.getString("name"));
			      System.out.println("\tphone: " + rs.getInt("phone"));
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
		 
	}
  
  public static void main(String[] args) {
	  chick_tionary pl = new chick_tionary();
	  pl.manage_table();
	 
  }
}