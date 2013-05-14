import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;


/**
 * Implementación de GestionTareas usando un Hashtable, mucho mejor
 * que con un Vector.
 * @author Pello Xabier Altadill
 *
 */
public class GestionTareasHash implements GestionTareas {
	Hashtable<Integer,Tarea> tareas = new Hashtable<Integer,Tarea>();
	// Esto lo usamos para generar identificadores
	int id = 0;
	
	@Override
	public int introducirTarea(String tarea) {
		// TODO Auto-generated method stub
		id++;
		tareas.put(id, new Tarea(id, tarea));
		return 0;
	}

	@Override
	public void eliminarTarea(int id) {
		// TODO Auto-generated method stub
		tareas.remove(id);
		
	}

	@Override
	public void modificarTarea(Tarea tarea) {
		// TODO Auto-generated method stub
		tareas.put(tarea.getId(), tarea);
		
	}

	@Override
	public Tarea buscarTarea(int id) {
		// TODO Auto-generated method stub
		return tareas.get(id);
	}

	/**
	 * Tenemos que devolver un Vector de Tareas pero internamente
	 * hay un Hashtable de Tareas, así que tenemos que coger cada
	 * elemento del Hashtable e ir metiéndolo en el Vector para
	 * luego devolverlo
	 */
	@Override
	public Vector<Tarea> listarTareas() {
		// TODO Auto-generated method stub
		// Vamos a recorrer todo a través de las claves
		Enumeration claves = tareas.keys();
		Vector<Tarea> resultado = new Vector<Tarea>();
		
		// Vamos sacando cada elemento del Hashtable de tareas
		// y los vamos metiendo en el Vector
		while(claves.hasMoreElements()) {
			resultado.add(tareas.get(claves.nextElement()));
		}
		return resultado;
	}
	
}
