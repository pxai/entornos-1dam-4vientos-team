/**
 * 
 */

/**
 * Representa una tarea con su id y el
 * texto de la tarea
 * @author Pello Altadill
 *
 */
public class Tarea {
	private int id;
	private String tarea;
	
	
	
	/**
	 * @param id
	 * @param tarea
	 */
	public Tarea(int id, String tarea) {
		this.id = id;
		this.tarea = tarea;
	}
	
	/**
	 * @return the tarea
	 */
	public String getTarea() {
		return tarea;
	}
	/**
	 * @param tarea the tarea to set
	 */
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
