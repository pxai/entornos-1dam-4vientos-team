import java.util.Vector;

/**
 * 
 */

/**
 * Define un interfaz para la gestión de tareas
 * @author Pello Altadill
 *
 */
public interface GestionTareas {
	public int introducirTarea(String tarea);
	public void eliminarTarea(int id);
	public void modificarTarea(Tarea tarea);
	public Tarea buscarTarea(int id);
	public Vector<Tarea> listarTareas();

}
