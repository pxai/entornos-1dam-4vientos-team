import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author luser
 *
 */
public class CustomerDAO {
	DataSource dataSource = new DataSource();
	
	/**
	 * gets Customer data from DataBase
	 * @param customerId
	 * @return
	 */
	public Customer read (int customerId) {
		Customer customer = null;
		String name = "";
		String address = "";
		String sql = "select * from customer where id=" + customerId;
		Connection connection = dataSource.getConnection();
			try {	
				Statement statement =  connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);

				if (resultSet.next()) {
					name = resultSet.getString("name");
					address = resultSet.getString("address");
					customer = new Customer(customerId, name, address);
				} 
		} catch (Exception e) {
			System.err.println("Exception: " +  sql + ". Error: " + e.getMessage());
		} 
		return customer;
	} 

	/**
	 * gets all Customer data from DataBase
	 * @return list of customers
	 */
	public List<Customer> readAll () {

		List<Customer> customerList = new ArrayList<Customer>();
		int id = 0;
		String name = "";
		String address = "";
		String sql = "select * from customer";
		Connection connection = dataSource.getConnection();
		try {	
			Statement statement =  connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				id = resultSet.getInt("id");
				name = resultSet.getString("name");
				address = resultSet.getString("address");
				customerList.add(new Customer(id, name, address));
			} 
		} catch (Exception e) {
			System.err.println("Exception: " +  sql + ". Error: " + e.getMessage());
		} 
		return customerList;
	} 
	
	/**
	 * creates new Customer
	 * @param newCustomer
	 * @return
	 */
	public int create (Customer newCustomer) {
		String sql = "insert into customer (name, address) values ('"+newCustomer.getName()+"','"+newCustomer.getAddress()+"')";
		Connection connection = null;
		Statement statement = null;
		int result = 0;
		
		try {
			connection = dataSource.getConnection();
		    statement = connection.createStatement();
		    result = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
		    
		    // try to get generated key
		    ResultSet rs = statement.getGeneratedKeys();
		    if (rs.next()){
		        result=rs.getInt(1);
		    }
		    
		    System.out.println("[DataService] create> " + sql);

		} catch (SQLException e) {
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
	public int update (Customer customer) {
		String sql = "update customer set name='"+customer.getName()+"',address='"+customer.getAddress()+"' where id="+customer.getId();
		Connection connection = null;
		Statement statement = null;
		int result = 0;
		
		try {
			connection = dataSource.getConnection();
		    statement = connection.createStatement();
		    result = statement.executeUpdate(sql);
		    System.out.println("[DataService] update> " + sql);
		} catch (SQLException e) {
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
			connection = dataSource.getConnection();
		    statement = connection.createStatement();
		    result = statement.executeUpdate(sql);
		    System.out.println("[DataService] delete> " + sql);
		} catch (SQLException e) {
			System.err.println("Exception: " +  sql + ". Error: " + e.getMessage());
		} finally {
		}
	    return result;
	}

}
