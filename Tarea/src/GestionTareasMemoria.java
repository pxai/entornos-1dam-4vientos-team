import java.util.Vector;

/**
 * 
 */

/**
 * Implementación de GestiónTareas con un Vector.
 * Es una MUY MALA implementación ya que el ID se basa en la posición
 * del Vector. En cuanto se borran o se introducen nuevos los ID dejan
 * de tener sentido. Ver {@link GestionTareasHash} para una implementación
 * bastante mejor.
 * @author pello_altadill
 *
 */
public class GestionTareasMemoria implements GestionTareas {

	private Vector<Tarea> tareas = new Vector<Tarea>();
	
	/**
	 * mete una nueva tarea
	 * Primero se añade la tarea con un ID=0 y luego lo
	 * modificamos según la posición en la que esté.
	 * @return el identificador de esa tarea
	 */
	@Override
	public int introducirTarea(String tarea) {
		Tarea nuevaTarea = new Tarea(0,tarea);
		tareas.add(nuevaTarea);
		tareas.elementAt(tareas.size()-1).setId(tareas.size()-1);
		return tareas.size();
	}

	/**
	 * eliminamos una tarea dado su id
	 */
	@Override
	public void eliminarTarea(int id) {
		// TODO Auto-generated method stub
		tareas.remove(id);
		
	}

	/**
	 * sacamos el vector que tenga ese ID y le modificamos el
	 * texto de tarea
	 */
	@Override
	public void modificarTarea(Tarea tarea) {
		tareas.get(tarea.getId()).setTarea(tarea.getTarea());
	}

	/**
	 * busca una tarea dado su ID,
	 * en este caso la posición
	 */
	@Override
	public Tarea buscarTarea(int id) {
		// TODO Auto-generated method stub
		return  tareas.elementAt(id);
	}

	/**
	 * Devuelve un vector con todas las tareas
	 */
	@Override
	public Vector<Tarea> listarTareas() {
		// TODO Auto-generated method stu
		return tareas;
	}

}
