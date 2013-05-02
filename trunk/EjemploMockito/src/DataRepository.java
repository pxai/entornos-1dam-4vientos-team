/**
 * 
 */

/**
 * Interface for a generic data repository
 * @author Pello Altadill
 *
 */
public interface DataRepository {
	public String prefix = "";
	
	/**
	 * saves data in repository
	 * @param key
	 * @param data
	 */
	public void saveData(String key, String data);
	
	/**
	 * reads data from repository for a key
	 * @param key
	 * @param data
	 */
	public String readData(String key);
	
	/**
	 * clears all data from the repository
	 */
	public void clearData ();
	
}
