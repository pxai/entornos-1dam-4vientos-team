package org.cuatrovientos.sqlite.SQLBurguer;

import java.sql.*;
import java.util.Scanner;


/**
 * Manage a burger, show products, gets order, shows order total,..
 * @author Colonel Sanders
 *
 */
public class sql_burguer {
	Connection con;

	/**
	 * default constructor
	 */
	public sql_burguer () {
	  
	}
  
	/**
	 * shows table data from database
	 * @return String with data
	 */
	public void manage_all () {
		String r = "";
		Scanner rd = new Scanner(System.in);
		String more = "";
		String nam = "";
		String prod = "";
		PreparedStatement prep = null;
		long order = 0;
			
		 try {
			 	// Connect to chicktionary
			    Class.forName("org.sqlite.JDBC");
			    con = DriverManager.getConnection("jdbc:sqlite:burguer.db");
			    
			    // We create a new Statement
			    Statement stat = con.createStatement();
			
			    // SHOW MENU
			    // Now we select data and we show results in a loop.
			    ResultSet rs = stat.executeQuery("select * from product;");
			    while (rs.next()) {
			      System.out.print(rs.getInt("id"));
			      System.out.print(".- " + rs.getString("name") +" ");
			      System.out.println(rs.getInt("price") + "$");
			    }
			    
			    // PRODUCT ORDER
			    order = System.currentTimeMillis();
			    prep = con.prepareStatement(
                          "insert into product_order (idproduct, order_number) values (?,?);");
                
			    do {
			    	System.out.println("Enter product nomber : ");
			    	prod = rd.nextLine();
                
			    	// For each new register we set the parameter and we add batch
			    	prep.setString(1, prod);
			    	prep.setLong(2, order);
			    	prep.addBatch();
			    	
			    	
			    	System.out.println("Do you want anything else? (Y/N)");
			    	more = rd.nextLine();
			    	
			    } while (!more.equals("N"));

		    	// ... executing the batch we finally insert data
		    	prep.executeBatch();

		    	
		    	// SHOW BILL
			    // We select order product data -joining tables-
			   prep = con.prepareStatement("select product.name, product.price, idproduct from product_order inner join product on product_order.idproduct=product.id where order_number=?");
               prep.setLong(1, order);

			   rs = prep.executeQuery();
			   double total = 0.0; 
			   System.out.println("\n-----\nOrder #"+ order);
			    while (rs.next()) {
			      System.out.print(rs.getInt("idproduct"));
			      System.out.print(".- " + rs.getString("name") + ": ");
			      System.out.println(rs.getFloat("price") + "$");
			      total += rs.getFloat("price");
			    }
			    
			    System.out.println("\n-----\nOrder total: " + total);
			    
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
	  sql_burguer pl = new sql_burguer();
	  pl.manage_all();
	 
  }
}