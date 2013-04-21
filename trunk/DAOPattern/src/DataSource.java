import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 
 */

/**
 * This class provides access to a DataSource
 * and is used by DAO classes to get the Connection instance
 * @author Pello Altadill
 *
 */
public class DataSource {
	
	private String dbUrl;
	private String login;
	private String password;
	private String driver;
	private Connection connection;
	
	/**
	 * constructor for DataService
	 * opens connection to DataSource
	 * uses default dbUrl
	 */
	public DataSource () {
		this.dbUrl = "jdbc:mysql://localhost:3306/erp";
		this.login = "root";
		this.password = "root";
		this.driver = "com.mysql.jdbc.Driver";
		openDataSource();
	}
	
	/**
	 * constructor for DataService
	 * @param dbUrl url to database
	 */
	public DataSource (String dbUrl, String login, String password, String driver) {
		this.dbUrl = dbUrl;
		this.login = login;
		this.password = password;
		this.driver = driver;
		openDataSource();
	}
	
	/**
	 * opens connection to DataSource
	 */
	private void openDataSource() {
		try {
			Class.forName(this.driver);
			connection = DriverManager.getConnection(this.dbUrl, this.login, this.password);
		} catch (SQLException sqle) {
			System.err.println("Connection error: " + sqle.getMessage());
		} catch (Exception e) {
			System.err.println("Connection error: " + e.getMessage());			
		}
	}
	
	/**
	 * returns current opened connection to DataSource
	 * @return Connection instance
	 */
	public Connection getConnection () {
		return connection;
	}
	
	/**
	 * closes DataSource connection
	 */
	public void close () {
		try {
			connection.close();
		} catch (SQLException sqle) {
			System.err.println("Connection error: " + sqle.getMessage());
		} catch (Exception e) {
			System.err.println("Connection error: " + e.getMessage());			
		}
	}
	

}
