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
	    resultset.close();
	    conn.close();
	} catch (Exception e) {
		System.err.println("Error: " + e.getMessage());
	}
}

}
