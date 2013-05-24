/**
* SQLiteExample
* It connects to a SQLite database in bdejemplo.db file which
* contains a single table called mitabla with two fields: an
* autonumeric "id" and a varchar type "nombre".
* @author Pello Xabier Altadill Izura
* @greetz to the true blue mug owner
*/
import java.sql.*;

public class SQLiteExample {
  public static void main(String[] args) {
	  try {
		    Class.forName("org.sqlite.JDBC");
		    Connection conn =
		      DriverManager.getConnection("jdbc:sqlite:bdejemplo.db");
		    Statement stat = conn.createStatement();
		
		    // First we insert two new registers using a prepared statement
		    PreparedStatement prep = conn.prepareStatement(
		    	      "insert into mitabla (nombre) values (?);");
		    
		    // For each new register we set the parameter and we add batch
		    prep.setString(1, "Otro dato");
		    prep.addBatch();
		    prep.setString(1, "Otro dato más");
		    prep.addBatch();
		    
		    // ... executing the batch we finally insert data
		    prep.executeBatch();
		    
		    // Now we select data and we show results in a loop.
		    ResultSet rs = stat.executeQuery("select * from mitabla;");
		    while (rs.next()) {
		      System.out.println("id = " + rs.getString("id"));
		      System.out.println("nombre = " + rs.getString("nombre"));
		    }
		    
		    // We close both the ResultSet and the DB connection
		    rs.close();
		    conn.close();
		    
	// In case of exception we catch them
	  } catch (SQLException sqle) {
		  System.err.println("SQL Exception: " + sqle.getMessage());
	  } catch (Exception e) {
		  System.err.println("Exception: " + e.getMessage());
	  }
  }
}