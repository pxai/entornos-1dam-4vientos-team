/**
 * 
 */
package org.cuatrovientos.erp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * CRUD operations on Customer table
 * C: Create
 * R: Read
 * U: Update
 * D: Delete
 * @author Pello Altadill
 *
 */
public class Customer {
	/**
	 * queries Customer table and returns data
	 * @return all customer data
	 */
	public String read () {
		String customerData = "";
		try {
		 Class.forName("com.mysql.jdbc.Driver");
		  Connection conn =
		  DriverManager.getConnection("jdbc:mysql://localhost/erp","root","");
		  Statement stat = conn.createStatement();
		  ResultSet resultset = stat.executeQuery("select * from customer;");
		  
		    while (resultset.next()) {
		      customerData += "id = " + resultset.getString("id");
		      customerData += ", name = " + resultset.getString("name");
		      customerData += ", address = " + resultset.getString("address");
		      customerData += "\n";
		    }
		    
		} catch (Exception e) {
			System.err.println("APURTU DU: " + e.getMessage());
			
		}
		
		return customerData;
	}
	
	
	
	/**
	 * inserts a new Customer
	 * @param name
	 * @param address
	 * @return
	 */
	public int create (String name, String address) {
		int result = 0;
		// TODO: this is not implemented		
		return result;
	}
	
	/**
	 * given id updates a Customer
	 * @param id
	 * @param name
	 * @param address
	 * @return
	 */
	public int update (int id, String name, String address) {
		int result = 0;
		// TODO: this is not implemented		
		return result;
	}
	
	/**
	 * removes a Customer with Its id
	 * @param id
	 * @param name
	 * @param address
	 * @return
	 */
	public int delete (int id) {
		int result = 0;
		// TODO: this is not implemented
		return result;
	}

}
