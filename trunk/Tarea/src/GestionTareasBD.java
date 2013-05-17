import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 * 
 */

/**
 * @author Pello Altadil
 *
 */
public class GestionTareasBD implements GestionTareas {
	
	
	/**
	 * opens db connection and returns Connections instance
	 * @return
	 */
	private Connection getConnection () {
		  Connection conn = null;
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  conn = DriverManager.getConnection("jdbc:mysql://localhost/tareas","root","");
		
		  } catch (Exception e) {
			  System.err.println("APURTU DU!! " + e.getMessage());
		  } 
		  
		  return conn;
	} 
	

	/* (non-Javadoc)
	 * @see GestionTareas#introducirTarea(java.lang.String)
	 */
	@Override
	public int introducirTarea(String tarea) {
		int result = 0;
		try {
			Connection conn = this.getConnection();
			Statement stat = conn.createStatement();
			String insertQuery = "insert into tareas (tarea) values ('"+ tarea +"')";
			result = stat.executeUpdate(insertQuery,Statement.RETURN_GENERATED_KEYS);
			
		    // try to get generated autonumeric key
		    ResultSet rs = stat.getGeneratedKeys();
		    if (rs.next()){
		        result=rs.getInt(1);
		    }
		    
		} catch (Exception e) {
			System.err.println("APURTU DU!! " + e.getMessage());
		}
		// TODO Auto-generated method stub
		return result;
	}

	/* (non-Javadoc)
	 * @see GestionTareas#eliminarTarea(int)
	 */
	@Override
	public void eliminarTarea(int id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see GestionTareas#modificarTarea(Tarea)
	 */
	@Override
	public void modificarTarea(Tarea tarea) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see GestionTareas#buscarTarea(int)
	 */
	@Override
	public Tarea buscarTarea(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see GestionTareas#listarTareas()
	 */
	@Override
	public Vector<Tarea> listarTareas() {
		// TODO Auto-generated method stub
		return null;
	}

}
