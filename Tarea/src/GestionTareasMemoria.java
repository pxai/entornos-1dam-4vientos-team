import java.util.Vector;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class GestionTareasMemoria implements GestionTareas {

	private Vector<String> tareas = new Vector<String>();
	
	/**
	 * mete una nueva tarea
	 * @return el identificador de esa tarea
	 */
	@Override
	public int introducirTarea(String tarea) {
		tareas.add(tarea);
		
		return tareas.size();
	}

	@Override
	public void eliminarTarea(int id) {
		// TODO Auto-generated method stub
		tareas.remove(id);
		
	}

	@Override
	public void modificarTarea(Tarea tarea) {
		// TODO Auto-generated method stub
		tareas.remove(tarea.getId());
		tareas.add(tarea.getTarea());
	}

	@Override
	public Tarea buscarTarea(int id) {
		// TODO Auto-generated method stub
		Tarea tarea = new Tarea(id, tareas.elementAt(id));
		return tarea;
	}

	@Override
	public Vector<Tarea> listarTareas() {
		// TODO Auto-generated method stub
		return tareas;
	}

}
