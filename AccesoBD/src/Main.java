import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


/**
 * @author pello_altadill
 *
 */
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  try {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn =
	  DriverManager.getConnection("jdbc:mysql://localhost/erp","root","");
	  Statement stat = conn.createStatement();
	  ResultSet resultset = stat.executeQuery("select * from customer;");
	  
	    while (resultset.next()) {
	      System.out.println("id = " + resultset.getString("id"));
	      System.out.println("name = " + resultset.getString("name"));
	    }
	    
	  // INSERT
	  String insertQuery = 
			  "insert into customer (name,address) values('Sauron','Mordor')";
	  int result = stat.executeUpdate(insertQuery);
	  
	  // DELETE
	  int id = 4;
	  String deleteQuery = "delete from customer where id=" + id;
	  result = stat.executeUpdate(deleteQuery);

	  // UPDATE
	  String who = "Saruman";
	  String updateQuery = 
	"update customer set address='The Shire' where name='"+who+"'";
	  result = stat.executeUpdate(updateQuery);
	  // PREPARED STATEMENT
	  String insertSQL = 
			"insert into customer (name,address) values (?, ?)";
	  PreparedStatement prep = conn.prepareStatement(insertSQL);

	    prep.setString(1, "Eomer");
	    prep.setString(2, "Rohan");
	    prep.addBatch();

	    prep.setString(1, "Sam");
	    prep.setString(2, "The Shire");
	    prep.addBatch();

	    prep.executeBatch();
	    resultset.close();
	    conn.close();
	} catch (Exception e) {
		System.err.println("Error: " + e.getMessage());
	}
}

}
