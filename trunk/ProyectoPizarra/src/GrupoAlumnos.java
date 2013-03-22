import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;


/**
 * Clase que representa el grupo de alumnos
 * extiende una hashtable cuya clave será el expediente 
 * y el objeto correspondiente una instancia de Alumno.
 * @author Pello Altadill
 *
 */
public class GrupoAlumnos 
	extends Hashtable<String, Alumno>{
	
	/**
	 * insertarAlumno
	 * introduce un alumno en el grupo. Si existe devuelve
	 * un mensaje de error, en caso contrario devuelve OK
	 * @param alumno
	 * @return
	 */
	public String insertarAlumno (Alumno alumno) {
		String resultado = "OK";
		if (this.containsKey(alumno.getExpediente())) {
			resultado = "Error, ese expediente ya existe en el grupo.";
		} else {
			this.put(alumno.getExpediente(), alumno);
		}

		return resultado;
	}
	
	/**
	 * Dado un número de expediente se elimina el alumno
	 * correspondiente del hashtable. Si no existiera se saca
	 * un mensaje de erro, si todo va bien se devuelve OK
	 * @param expediente
	 * @return
	 */
	public String eliminarAlumno (String expediente) {
		String resultado = "OK";
		if (!this.containsKey(expediente)) {
			resultado = "Error, ese expediente NO existe en el grupo.";
		} else {
			this.remove(expediente);
		}

		return resultado;
	}
	
	/**
	 * recorre todos los alumnos y les saca los datos, los cuales los va 
	 * concatenando en un String para devolverlos al final. Si no hubiera
	 * ninguno se muestra un mensaje indicándolo.
	 * @return
	 */
	public String mostrarAlumnos () {
		String resultado = "";
		Set<String> claves = this.keySet();
		
		if (claves.isEmpty()) {
			resultado = "Grupo de alumnos vacío.";
		} else {
			for (String clave : claves) {
				resultado += this.get(clave).toString();
			}
		}
		
		return resultado;
	}
	
	/**
	 * recorre todos los alumnos y les saca las veces que han salido
	 * para calcular una media
	 * @return
	 */
	public float mostrarMedia () {
		float resultado = 0;
		float sumaDeVeces = 0;
		Set<String> claves = this.keySet();
		
		if (!claves.isEmpty()) {
			for (String clave : claves) {
				sumaDeVeces += this.get(clave).getVeces();
			}
			resultado = sumaDeVeces / this.size();
		}
		
		return resultado;
	}
	
	/**
	 * Saca un alumno aleatorio del Hashtable.
	 * En caso de estar vacío, devuelve un mensaje de error
	 * @return
	 */
	public String sacarAleatorio () {
		int contador = 0;
		int limite = 0;
		Random aleatorio = new Random();
		
		if (!this.isEmpty()) {
			Set<String> claves = this.keySet();
		
			// 	Sacamos un número aleatorio de 0 al tamaño del grupo
			limite = aleatorio.nextInt(this.size());
		
			// Recorremos el Hashtable hasta encontrar
			for (String clave : claves) {
				if (contador == limite) {
					this.get(clave).incrementarVeces();
					return this.get(clave).getNombre();
				}
				contador++;
			}//for
		}//if

		// si no se ha salido en el for
		// es que el grupo está vacío...
		return "Grupo de alumnos vacío.";

	}

}
