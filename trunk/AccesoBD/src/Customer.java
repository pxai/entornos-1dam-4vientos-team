import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class Customer {
	/**
	 * gets Customer data from DataBase
	 * @param customerId
	 * @return
	 */
	public String read (int customerId) {
		String resultado = "";
		String name = "";
		String address = "";
		String sql = "select * from customer where id=" + customerId;
			try {	
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp", "root", "root");
				Statement statement =  connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);

				if (resultSet.next()) {
					name = resultSet.getString("name");
					address = resultSet.getString("address");
					resultado +=customerId+","+name+","+ address + "\n";
				} 
		} catch (Exception e) {
			System.err.println("Exception: " +  sql + ". Error: " + e.getMessage());
		} 
		return resultado;
	} 

	/**
	 * gets all Customer data from DataBase
	 * @return list of customers
	 */
	public String readAll () {

		String resultado = "";
		int id = 0;
		String name = "";
		String address = "";
		String sql = "select * from customer";
		try {	
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp", "root", "root");
			Statement statement =  connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				id = resultSet.getInt("id");
				name = resultSet.getString("name");
				address = resultSet.getString("address");
				resultado +=id+","+name+","+ address + "\n";
			} 
		} catch (Exception e) {
			System.err.println("Exception: " +  sql + ". Error: " + e.getMessage());
		} 
		return resultado;
	} 
	
	/**
	 * creates new Customer
	 * @param newCustomer
	 * @return
	 */
	public int create (String name, String address) {
		String sql = "insert into customer (name, address) values ('"+name+"','"+address+"')";
		Connection connection = null;
		Statement statement = null;
		int result = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp", "root", "root");

		    statement = connection.createStatement();
		    result = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
		    
		    // try to get generated key
		    ResultSet rs = statement.getGeneratedKeys();
		    if (rs.next()){
		        result=rs.getInt(1);
		    }
		    
		    System.out.println("create> " + sql);

		} catch (Exception e) {
			System.err.println("Exception: " +  sql + ". Error: " + e.getMessage());
		} finally {
		}
	    return result;
	}
	
	/**
	 * updates customer information 
	 * @param customer
	 * @return
	 */
	public int update (int id, String name, String address) {
		String sql = "update customer set name='"+name+"',address='"+address+"' where id="+id;
		Connection connection = null;
		Statement statement = null;
		int result = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp", "root", "root");

		    statement = connection.createStatement();
		    result = statement.executeUpdate(sql);
		    System.out.println(" update> " + sql);
		} catch (Exception e) {
			System.err.println("Exception: " +  sql + ". Error: " + e.getMessage());
		} finally {
		}
	    return result;
	}
	
	/**
	 * delete customer  
	 * @param customerId
	 * @return
	 */
	public int delete (int customerId) {
		String sql = "delete from customer where id="+customerId;
		Connection connection = null;
		Statement statement = null;
		int result = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp", "root", "root");
		    statement = connection.createStatement();
		    result = statement.executeUpdate(sql);
		    System.out.println("[DataService] delete> " + sql);
		} catch (Exception e) {
			System.err.println("Exception: " +  sql + ". Error: " + e.getMessage());
		} finally {
		}
	    return result;
	}

}
